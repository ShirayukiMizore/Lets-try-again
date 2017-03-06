package Mizore.Managers;

import Mizore.Common.Items.Chisel;
import Mizore.Common.Items.FirstItem;
import mod.chiselsandbits.core.ChiselsAndBits;
import mod.chiselsandbits.core.api.ChiselAndBitsAPI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;

import static Mizore.Utils.Refrences.DevTab;
import static Mizore.Utils.Refrences.MODID;

/**
 * Created by frost on 3/5/2017.
 */
public class ItemManager {

    public static HashMap<String, Item> Items = new HashMap<String, Item>();

    public ItemManager(){
        RegisterItems();
        grabmoditems();
    }

    private void RegisterItems() {
        Items.put("first item", new FirstItem().setUnlocalizedName("first").setCreativeTab(DevTab));
        Items.put("flint Chisel", new Chisel().setUnlocalizedName("chisel").setCreativeTab(DevTab));
        //register them all
        Items.values().forEach(T->{
            GameRegistry.register(T, new ResourceLocation(MODID+":"+T.getUnlocalizedName().substring(5)));
        });
    }

    private void grabmoditems(){

    }

    public void registerRenderers(){
        registerRender(Items.get("first item"));
    }

    public static void registerRender(Item item){
        System.out.println("Loading render for :"+item.getUnlocalizedName().substring(5));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0, new ModelResourceLocation(MODID+":"+item.getUnlocalizedName().substring(5), "inventory"));
    }

}
