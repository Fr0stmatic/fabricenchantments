package safro.fabric.enchantments.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import safro.fabric.enchantments.FabricEnchantments;
import safro.fabric.enchantments.config.FabricEnchantmentsConfig;

public class HomingEnchantment extends Enchantment {

    public HomingEnchantment() {
        super(Rarity.VERY_RARE, EnchantmentTarget.CROSSBOW, new EquipmentSlot[] {EquipmentSlot.MAINHAND});

        if (FabricEnchantmentsConfig.getBooleanValue("homing")) {
            Registry.register(Registry.ENCHANTMENT, new Identifier("fabricenchantments", "homing"), this);
        }
    }

    public int getMinPower(int level) {
        return 12 + (level - 1) * 20;
    }

    public int getMaxPower(int level) {
        return 50;
    }

    @Override
    public int getMaxLevel() { return 1; }

    @Override
    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != FabricEnchantments.SHOTGUN;
    }
}
