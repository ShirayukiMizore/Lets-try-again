package Mizore.Common;

import Mizore.Common.Tabs.DevTab;
import Mizore.Managers.ItemManager;
import Mizore.Managers.VanillaEditor;
import Mizore.Utils.Refrences;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import static Mizore.Utils.Refrences.itemManager;
import static Mizore.Utils.Refrences.vanillaEditor;

/**
 * Created by frost on 2/28/2017.
 */
public class CommonProxy  {

    public void PreInit(FMLPreInitializationEvent event){
        Refrences.DevTab = new DevTab();
        itemManager = new ItemManager();
        vanillaEditor = new VanillaEditor();
    }

    public void Init(FMLInitializationEvent event){

    }

    public void PostInit(FMLPostInitializationEvent event){

    }

}
