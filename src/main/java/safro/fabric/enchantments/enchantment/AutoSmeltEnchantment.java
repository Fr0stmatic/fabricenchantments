package safro.fabric.enchantments.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.Registry;
import safro.fabric.enchantments.config.EnchantmentConfigs;

public class AutoSmeltEnchantment extends Enchantment {

    public AutoSmeltEnchantment() {
        super(Rarity.RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[] {EquipmentSlot.MAINHAND});

        if (EnchantmentConfigs.getValue("auto_smelt")) {
            Registry.register(Registry.ENCHANTMENT, new Identifier("fabricenchantments", "auto_smelt"), this);
        }
    }

    @Override
    public int getMinPower(int level) { return 12; }

    @Override
    public int getMaxLevel() { return 1; }
}
