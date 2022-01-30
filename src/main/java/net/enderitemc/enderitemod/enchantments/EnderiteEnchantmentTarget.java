package net.enderitemc.enderitemod.enchantments;

import net.enderitemc.enderitemod.misc.EnderiteTag;
import net.minecraft.world.item.Item;

public enum EnderiteEnchantmentTarget {
    NOT_ENDERITE {
        public boolean isAcceptableItem(Item item) {
            return !item.getDefaultInstance().is(EnderiteTag.ENDERITE_ITEM);
        }
    };

    private EnderiteEnchantmentTarget() {
    }

    public abstract boolean isAcceptableItem(Item item);
}