package safro.fabric.enchantments.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import safro.fabric.enchantments.config.FabricEnchantmentsConfig;

public class AutoSmeltEnchantment extends Enchantment {

    public AutoSmeltEnchantment() {
        super(Rarity.RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND});

        if (FabricEnchantmentsConfig.getBooleanValue("auto_smelt")) {
            Registry.register(Registries.ENCHANTMENT, new Identifier("fabricenchantments", "auto_smelt"), this);
        }
    }

    @Override
    public int getMinPower(int level) {
        return 12;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.SILK_TOUCH;
    }
}
