using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
using CSharpBlog.Data;
using CSharpBlog.Models;

namespace CSharpBlog.Controllers
{
    public class ArticleController : Controller
    {
        private readonly ApplicationDbContext database;

        public ArticleController(ApplicationDbContext context)
        {
            database = context;
        }

        public ActionResult Index()
        {
            return RedirectToAction("List");
        }

        public ActionResult List()
        {
            var articles = database.Articles
                .Include(a => a.Author)
                .ToList();

            return View(articles);
        }

        //// GET: Article/Details/5
        //public async Task<IActionResult> Details(int? id)
        //{
        //    if (id == null)
        //    {
        //        return NotFound();
        //    }

        //    var article = await database.Articles
        //        .Include(a => a.Author)
        //        .SingleOrDefaultAsync(m => m.Id == id);
        //    if (article == null)
        //    {
        //        return NotFound();
        //    }

        //    return View(article);
        //}

        // GET: Article/Details
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return StatusCode(500);
            }

            var article = database.Articles
                .Include(a => a.Author)
                .First(m => m.Id == id);

            if (article == null)
            {
                return StatusCode(500);
            }

            return View(article);
        }

        // GET: Article/Create
        public IActionResult Create()
        {
            ViewData["AuthorId"] = new SelectList(database.Users, "Id", "Id");
            return View();
        }

        // POST: Article/Create
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Create([Bind("Id,Title,Content,AuthorId")] Article article)
        {
            if (ModelState.IsValid)
            {
                database.Add(article);
                await database.SaveChangesAsync();
                return RedirectToAction(nameof(Index));
            }
            ViewData["AuthorId"] = new SelectList(database.Users, "Id", "Id", article.AuthorId);
            return View(article);
        }

        // GET: Article/Edit/5
        public async Task<IActionResult> Edit(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var article = await database.Articles.SingleOrDefaultAsync(m => m.Id == id);
            if (article == null)
            {
                return NotFound();
            }
            ViewData["AuthorId"] = new SelectList(database.Users, "Id", "Id", article.AuthorId);
            return View(article);
        }

        // POST: Article/Edit/5
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Edit(int id, [Bind("Id,Title,Content,AuthorId")] Article article)
        {
            if (id != article.Id)
            {
                return NotFound();
            }

            if (ModelState.IsValid)
            {
                try
                {
                    database.Update(article);
                    await database.SaveChangesAsync();
                }
                catch (DbUpdateConcurrencyException)
                {
                    if (!ArticleExists(article.Id))
                    {
                        return NotFound();
                    }
                    else
                    {
                        throw;
                    }
                }
                return RedirectToAction(nameof(Index));
            }
            ViewData["AuthorId"] = new SelectList(database.Users, "Id", "Id", article.AuthorId);
            return View(article);
        }

        // GET: Article/Delete/5
        public async Task<IActionResult> Delete(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var article = await database.Articles
                .Include(a => a.Author)
                .SingleOrDefaultAsync(m => m.Id == id);
            if (article == null)
            {
                return NotFound();
            }

            return View(article);
        }

        // POST: Article/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> DeleteConfirmed(int id)
        {
            var article = await database.Articles.SingleOrDefaultAsync(m => m.Id == id);
            database.Articles.Remove(article);
            await database.SaveChangesAsync();
            return RedirectToAction(nameof(Index));
        }

        private bool ArticleExists(int id)
        {
            return database.Articles.Any(e => e.Id == id);
        }
    }
}
