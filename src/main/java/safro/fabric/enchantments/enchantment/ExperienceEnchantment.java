package safro.fabric.enchantments.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import safro.fabric.enchantments.config.EnchantmentConfigs;

public class ExperienceEnchantment extends Enchantment {

    public ExperienceEnchantment() {
        super(Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});

        if (EnchantmentConfigs.getValue("experience")) {
            Registry.register(Registry.ENCHANTMENT, new Identifier("fabricenchantments", "experience"), this);
        }
    }

    @Override
    public int getMinPower(int level) {
        return 10 + 20 * (level - 1);
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }
}
