package Minecrafter1912.Scarecrow.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSmallScarecrow extends ModelBase
{
	ModelRenderer fence;
	ModelRenderer body;
	ModelRenderer rightArm;
	ModelRenderer leftArm;
	ModelRenderer head;

	public ModelSmallScarecrow()
	{
		textureWidth = 64;
		textureHeight = 32;

		fence = new ModelRenderer(this, 0, 0);
		fence.addBox(0F, 0F, 0F, 2, 7, 2);
		fence.setRotationPoint(-1F, 17F, -1F);
		fence.setTextureSize(64, 32);
		fence.mirror = true;
		setRotation(fence, 0F, 0F, 0F);
		body = new ModelRenderer(this, 9, 0);
		body.addBox(0F, 0F, 0F, 6, 10, 6);
		body.setRotationPoint(-3F, 7F, -3F);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		rightArm = new ModelRenderer(this, 39, 0);
		rightArm.addBox(0F, 0F, 0F, 1, 8, 1);
		rightArm.setRotationPoint(-2F, 12F, 0F);
		rightArm.setTextureSize(64, 32);
		rightArm.mirror = true;
		setRotation(rightArm, 0F, 0F, 2.193538F);
		leftArm = new ModelRenderer(this, 34, 0);
		leftArm.addBox(-1F, 0F, 0F, 1, 8, 1);
		leftArm.setRotationPoint(2F, 12F, 0F);
		leftArm.setTextureSize(64, 32);
		leftArm.mirror = true;
		setRotation(leftArm, 0F, 0F, -2.19353F);
		head = new ModelRenderer(this, 32, 16);
		head.addBox(0F, 0F, 0F, 8, 8, 8);
		head.setRotationPoint(-4F, 0F, -4F);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		fence.render(f5);
		body.render(f5);
		rightArm.render(f5);
		leftArm.render(f5);
		head.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
