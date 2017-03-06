package Mizore.Common.Items;

import jdk.nashorn.internal.ir.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.ParticleBlockDust;
import net.minecraft.client.particle.ParticleDigging;
import net.minecraft.command.CommandFill;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFirework;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

import static net.minecraft.init.Blocks.*;

/**
 * Created by frost on 3/5/2017.
 */
public class Chisel extends Item {
    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.BOW;
    }

    @Override//time it takes to "charge"
    public int getMaxItemUseDuration(ItemStack stack) {
        return 70000;
    }


    
    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        worldIn.spawnParticle(EnumParticleTypes.LAVA, hitX, hitY+1D, hitZ, 0D,0D,0D, new int[0]);
        if (!worldIn.isRemote){
            System.out.println(pos);
            if (worldIn.getBlockState(pos).getBlock() != null){
                Random random = new Random();
                net.minecraft.block.Block lookingat = worldIn.getBlockState(pos).getBlock();
                if (lookingat == Blocks.STONE) {
                    spawnparticles(worldIn, pos);
                    if (Mizore.Utils.MathHelper.RandomChance(10)){
                        worldIn.setBlockState(pos, Blocks.COBBLESTONE.getDefaultState());
                        return EnumActionResult.SUCCESS;
                    }
                } else if (lookingat == Blocks.COBBLESTONE){
                    worldIn.setBlockToAir(pos);
                    //spawn lots of particals and a bebble

                }
            }

            spawnparticles(worldIn, pos);

        }

        return EnumActionResult.FAIL;
    }
    public void spawnparticles(World worldIn, BlockPos pos){
        //spawn the particle
        Random R = new Random();
        System.out.println("Spawning particals");
        for(int p = 0; p <= 6; ++p){
            /*worldIn.spawnParticle(EnumParticleTypes.BLOCK_CRACK, pos.getX(),pos.getY()+2,pos.getZ(),
                    0,1,0, Blocks.COBBLESTONE.getStateId(Blocks.COBBLESTONE.getDefaultState()));
            */

            //Minecraft.getMinecraft().renderGlobal.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, pos.getX(), pos.getY(), pos.getZ(),1,1,1);
            System.out.println("Spawned at: "+pos);
        }
    }

    /*
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemStack =  playerIn.getHeldItem(handIn);
        if (!worldIn.isRemote){
            RayTraceResult result = playerIn.rayTrace(5,1F);
            switch (worldIn.getBlockState(result))
        }

        return new ActionResult(EnumActionResult.PASS, itemStack);
    }*/
}
