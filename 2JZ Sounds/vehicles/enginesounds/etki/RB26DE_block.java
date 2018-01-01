package java.game.parts.engines.Nissan_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_inline.*;
import java.game.cars.*;


public class RB26DE_block extends Block_Inline_OHC
{
	public RB26DE_block( int id )
	{
		super( id );
		name = "RB26DE Engine Block";
		description = "RB26DE Stock Engine Block from Nissan";

		value = tHUF2USD(200);
		brand_new_prestige_value = 230.00;
		setMaxWear(kmToMaxWear(420000.00));

		bore = 86.00;

		crankshaft_slot_ID = 33;
		crankshaft_bearing_slot_ID = 41;
		cylinder_head_slot_ID = 19;
		transmission_slot_ID = 35;
		oil_pan_slot_ID = 31;

		cylinder_length_from_top = 123.66;
		crank_center_to_cylinder_top = 236.37;

		rpm_idle = 1000.0;
		time_spark_min	= sparkAngleTo4cycleTime(318.0);
		time_spark_inc	= sparkAngleTo4cycleTime(340.0)-time_spark_min;
		time_spark_RPM0	= 3250;
		time_spark_RPM1	= 7250;
		RPM_limit	= 12000;

		cylinders	= 6;

		check4warnings();
	}

	public void updatevariables()
	{
		super.updatevariables();

		if (the_car)
		{
			the_car.starter_torque = 50.0;
			SfxTable tab;
			if (tab = the_car.getSfxTable(0)) //Acceleration
			{
				tab.clear();
//				tab.addItem(new ResourceRef(Toyota_Supra_Sounds:0x000000A2r), 04000.0, 0100.0, RPM_limit+600, 1.50, 6.40); //Engine
//				tab.addItem(new ResourceRef(Toyota_Supra_Sounds:0x000000A2r), 04500.0, 3000.0, 12000.0, 5.99, 7.99); //Turbo	
//				tab.addItem(new ResourceRef(Toyota_Supra_Sounds:0x000000A3r), 18000.0, 0500.0, 02500.0, 1.12, 1.99); //IDK? idle
//				tab.addItem(new ResourceRef(Toyota_Supra_Sounds:0x000000A4r), 06000.0, RPM_limit-650, 18000.0, 12.12, 12.99); //RevLimiter					
            }			
			if (tab = the_car.getSfxTable(1)) //Deceleration
			{
				tab.clear();
//				if (dynodata.mixture_ratio > 8.0 )
				tab.addItem(new ResourceRef(Toyota_Supra_Sounds:0x000000A3r), 4000.0,  0100.0, 7500.0, 1.30, 3.00); // Exhaust
//  			tab.addItem(new ResourceRef(Toyota_Supra_Sounds:0x000000A9r), 6000.0,  4000.0, 7800.0, 4.00, 4.00); // Bang
//  			tab.addItem(new ResourceRef(Toyota_Supra_Sounds:0x000000B1r), 7000.0,  6500.0, 7280.0, 4.00, 4.00); // Bang2
//  			tab.addItem(new ResourceRef(Toyota_Supra_Sounds:0x000000ABr), 4500.0,  3600.0, 5000.0, 2.00, 2.00); // Bang3
			}
			if (tab = the_car.getSfxTable(2)) //Forced Induction
			{
				tab.clear();
//				if (dynodata.P_turbo_waste > 0.01 )  
//                tab.addItem(new ResourceRef(Toyota_Supra_Sounds:0x000000A6r), 6200.0,  3400.0, 7500.0, 4.90, 4.90); // BOV
//                tab.addItem(new ResourceRef(Toyota_Supra_Sounds:0x000000A5r), 4500.0,  4000.0, 7000.0, 0.49, 1.99); // Turbo Off  
				the_car.setSfxExhaustMinVol(0.9);
			}
		}
	}
     public String isDynoable()
	{
		Part p;

		p = partOnSlot( 32 );
		if (!p)
			return "the engine is missing the alternator.";

		return super.isDynoable();   	
	}

}