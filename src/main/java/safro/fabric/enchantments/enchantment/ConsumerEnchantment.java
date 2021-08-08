package safro.fabric.enchantments.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import safro.fabric.enchantments.config.EnchantmentConfigs;

public class ConsumerEnchantment extends Enchantment {

    public ConsumerEnchantment() {
        super(Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});

        if (EnchantmentConfigs.getValue("consumer")) {
            Registry.register(Registry.ENCHANTMENT, new Identifier("fabricenchantments", "consumer"), this);
        }
    }

    @Override
    public int getMinPower(int level) {
        return 10 + 20 * (level - 1);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

}
