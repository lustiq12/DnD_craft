
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dndcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.dndcraft.DndCraftMod;

public class DndCraftModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, DndCraftMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> SHIELD_PARTICLE = REGISTRY.register("shield_particle", () -> new SimpleParticleType(true));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> SLIMYPARTICLE = REGISTRY.register("slimyparticle", () -> new SimpleParticleType(true));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BLOOD = REGISTRY.register("blood", () -> new SimpleParticleType(false));
}
