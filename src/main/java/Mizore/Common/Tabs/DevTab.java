package Mizore.Common.Tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by frost on 3/5/2017.
 */
public class DevTab extends CreativeTabs {
    public DevTab() {
        super("tab_dev");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.COMMAND_BLOCK_MINECART, 69);
    }
}
