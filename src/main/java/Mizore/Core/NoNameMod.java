package Mizore.Core;

import Mizore.Common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static Mizore.Utils.Refrences.MODID;
import static Mizore.Utils.Refrences.VERSION;

/**
 * Created by frost on 2/28/2017.
 */

@Mod(version = VERSION, modid = MODID)
public class NoNameMod {

    @SidedProxy(clientSide = "Mizore.Client.ClientProxy", serverSide = "Mizore.Common.CommonProxy")
    public CommonProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event){proxy.PreInit(event);}

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){proxy.Init(event);}

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event){proxy.PostInit(event);}




}
