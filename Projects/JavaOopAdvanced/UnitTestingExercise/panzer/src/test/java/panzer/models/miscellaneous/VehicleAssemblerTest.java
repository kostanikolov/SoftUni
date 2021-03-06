package panzer.models.miscellaneous;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import panzer.contracts.Assembler;
import panzer.contracts.AttackModifyingPart;
import panzer.contracts.DefenseModifyingPart;
import panzer.contracts.HitPointsModifyingPart;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.List;

public class VehicleAssemblerTest {

    private Assembler vehicleAssembler;
    private AttackModifyingPart attackModifyingPart;
    private DefenseModifyingPart defenseModifyingPart;
    private HitPointsModifyingPart hitPointsModifyingPart;

    @Before
    public void setUp() {
        this.vehicleAssembler = new VehicleAssembler();

        this.attackModifyingPart = Mockito.mock(AttackModifyingPart.class);
        this.defenseModifyingPart = Mockito.mock(DefenseModifyingPart.class);
        this.hitPointsModifyingPart = Mockito.mock(HitPointsModifyingPart.class);

        this.vehicleAssembler.addArsenalPart(this.attackModifyingPart);
        this.vehicleAssembler.addShellPart(this.defenseModifyingPart);
        this.vehicleAssembler.addEndurancePart(this.hitPointsModifyingPart);
    }

    @Test
    public void getTotalWeight() {
        Mockito.when(this.attackModifyingPart.getWeight()).thenReturn(10.0);
        Mockito.when(this.defenseModifyingPart.getWeight()).thenReturn(20.0);
        Mockito.when(this.hitPointsModifyingPart.getWeight()).thenReturn(30.0);

        double actualTotalWeight = this.vehicleAssembler.getTotalWeight();
        double expectedTotalWeight = 60.0;

        Assert.assertEquals(expectedTotalWeight, actualTotalWeight, 0.1);
    }

    @Test
    public void getTotalPrice() {
        Mockito.when(this.attackModifyingPart.getPrice()).thenReturn(BigDecimal.ZERO);
        Mockito.when(this.defenseModifyingPart.getPrice()).thenReturn(BigDecimal.TEN);
        Mockito.when(this.hitPointsModifyingPart.getPrice()).thenReturn(BigDecimal.ONE);

        BigDecimal actualTotalPrice = this.vehicleAssembler.getTotalPrice();
        BigDecimal expectedTotalPrice = BigDecimal.valueOf(11);

        Assert.assertEquals(expectedTotalPrice, actualTotalPrice);
    }

    @Test
    public void getTotalPriceWithoutParts() {
        Assembler assembler = new VehicleAssembler();

        BigDecimal actualTotalPrice = assembler.getTotalPrice();
        BigDecimal expectedTotalPrice = BigDecimal.ZERO;

        Assert.assertEquals(expectedTotalPrice, actualTotalPrice);
    }

    @Test
    public void getTotalAttackModification() {
        Mockito.when(this.attackModifyingPart.getAttackModifier()).thenReturn(50);

        AttackModifyingPart attackModifyingPart = Mockito.mock(AttackModifyingPart.class);
        Mockito.when(attackModifyingPart.getAttackModifier()).thenReturn(120);

        this.vehicleAssembler.addArsenalPart(attackModifyingPart);

        long actualTotalAttackModification = this.vehicleAssembler.getTotalAttackModification();
        long expectedTotalAttackModification = 170;

        Assert.assertEquals(expectedTotalAttackModification, actualTotalAttackModification);
    }

    @Test
    public void getTotalDefenseModification() {
        Mockito.when(this.defenseModifyingPart.getDefenseModifier()).thenReturn(50);

        DefenseModifyingPart defenseModifyingPart = Mockito.mock(DefenseModifyingPart.class);
        Mockito.when(defenseModifyingPart.getDefenseModifier()).thenReturn(120);

        this.vehicleAssembler.addShellPart(defenseModifyingPart);

        long actualTotalDefenseModification = this.vehicleAssembler.getTotalDefenseModification();
        long expectedTotalDefenseModification = 170;

        Assert.assertEquals(expectedTotalDefenseModification, actualTotalDefenseModification);
    }

    @Test
    public void getTotalHitPointModification() {
        Mockito.when(this.hitPointsModifyingPart.getHitPointsModifier()).thenReturn(50);

        HitPointsModifyingPart hitPointsModifyingPart = Mockito.mock(HitPointsModifyingPart.class);
        Mockito.when(hitPointsModifyingPart.getHitPointsModifier()).thenReturn(120);

        this.vehicleAssembler.addEndurancePart(hitPointsModifyingPart);

        long actualTotalHitPointModification = this.vehicleAssembler.getTotalHitPointModification();
        long expectedTotalHitPointModification = 170;

        Assert.assertEquals(expectedTotalHitPointModification, actualTotalHitPointModification);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testAddArsenalPartCollectionSize() {
        Assembler assembler = new VehicleAssembler();

        AttackModifyingPart part = Mockito.mock(AttackModifyingPart.class);
        AttackModifyingPart part1 = Mockito.mock(AttackModifyingPart.class);
        AttackModifyingPart part2 = Mockito.mock(AttackModifyingPart.class);

        assembler.addArsenalPart(part);
        assembler.addArsenalPart(part1);
        assembler.addArsenalPart(part2);

        int actualSize = 0;
        try {
            Field arsenalParts = assembler.getClass().getDeclaredField("arsenalParts");
            arsenalParts.setAccessible(true);
            List<AttackModifyingPart> parts = (List<AttackModifyingPart>) arsenalParts.get(assembler);

            actualSize = parts.size();

        } catch (NoSuchFieldException | IllegalAccessException e) {
           e.printStackTrace();
        }

        int expectedSize = 3;

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testAddArsenalPart() {
        Assembler assembler = new VehicleAssembler();

        AttackModifyingPart part = Mockito.mock(AttackModifyingPart.class);
        AttackModifyingPart part1 = Mockito.mock(AttackModifyingPart.class);

        Mockito.when(part.getAttackModifier()).thenReturn(Integer.MAX_VALUE);
        Mockito.when(part1.getAttackModifier()).thenReturn(Integer.MAX_VALUE);


        assembler.addArsenalPart(part);
        assembler.addArsenalPart(part1);

        long actualTotalAttackModification = assembler.getTotalAttackModification();
        long expectedTotalAttackModification = (long) Integer.MAX_VALUE + Integer.MAX_VALUE;

        Assert.assertEquals(expectedTotalAttackModification, actualTotalAttackModification);
    }
}
