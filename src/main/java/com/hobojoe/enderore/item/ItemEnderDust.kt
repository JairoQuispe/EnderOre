package com.hobojoe.enderore.item

import com.hobojoe.enderore.EnderOre
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly
import net.minecraftforge.oredict.OreDictionary

/**
 * Created by Joseph on 11/18/2016.
 */
class ItemEnderDust : Item() {

    val name = "dust_ender"

    init {
        unlocalizedName = "${EnderOre.MODID}.$name"
        setRegistryName(name)
        setCreativeTab(CreativeTabs.MISC)
    }

    fun initOreDict() {
        OreDictionary.registerOre("dustEnder", this)
    }

    @SideOnly(Side.CLIENT)
    fun initModel() {
        registryName?.let { name ->
            ModelLoader.setCustomModelResourceLocation(this, 0 , ModelResourceLocation(name, "inventory"))
        }
    }
}