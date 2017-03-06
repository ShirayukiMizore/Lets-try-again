package Mizore.Managers;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.HashMap;
import java.util.List;

/**
 * Created by frost on 3/6/2017.
 */
public class VanillaEditor {
    public VanillaEditor(){
        MinecraftForge.EVENT_BUS.register(this);
    }
    public HashMap<Item, String> ToolTips = new HashMap(){{
        put(Items.DIAMOND, "this is a test desc");
        put(Items.IRON_INGOT, "testing\nmulti\nline");
    }};
    //adds "info" to vanilla items and blocks

    @SubscribeEvent
    public void ToolTips(ItemTooltipEvent event) {
        Item item = event.getItemStack().getItem();
        if (ToolTips.containsKey(item)) {
            event.getToolTip().add("eyy this is a test");
        }
    }
}
