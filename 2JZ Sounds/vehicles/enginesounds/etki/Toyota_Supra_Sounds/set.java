//2jz/ls1 REVLIMITER 7250


			if (tab = the_car.getSfxTable(0)) //acceleration
			{
				tab.addItem(new ResourceRef(parts.23:0x000000A0r), 4000.0, 100.0, RPM_limit+600, 1.50, 6.40); // Engine
                tab.addItem(new ResourceRef(parts.23:0x000000A0r), 4500.0, 3000.0, 7900.0, 5.99, 7.99); //TURBO
				tab.addItem(new ResourceRef(parts.23:0x000000AEr), 18000.0, 500.0, 2500.0, 1.12, 1.99); //idle
				tab.addItem(new ResourceRef(parts.23:0x000000A4r),6000.0, RPM_limit-650, 18000.0, 12.12, 12.99); //revlimiter
            }			
			if (tab = the_car.getSfxTable(1)) //deceleration
			{
				tab.clear();
				if (dynodata.mixture_ratio > 8.0 )
				tab.addItem(new ResourceRef(parts.23:0x000000A2r), 4000.0, 100.0, 7500.0, 1.30, 3.00); // Exhaust
                tab.addItem(new ResourceRef(parts.23:0x000000A9r), 6000.0,  4000.0, 7800.0, 4.00, 4.00); // Bang
                tab.addItem(new ResourceRef(parts.23:0x000000B1r), 7000.0,  6500.0, 7280.0, 4.00, 4.00); // Bang2
                tab.addItem(new ResourceRef(parts.23:0x000000ABr), 4500.0,  3600.0, 5000.0, 2.00, 2.00); // Bang3
			}

			if (tab = the_car.getSfxTable(2)) //forced_induction
			{
				tab.clear();
				if (dynodata.P_turbo_waste > 0.01 )  
                tab.addItem(new ResourceRef(parts.23:0x000000A0r), 6200.0,  3400.0, 7500.0, 4.90, 4.90); // bov
                tab.addItem(new ResourceRef(parts.23:0x000000ABr), 4500.0, 4000.0, 7000.0, 0.49, 1.99); // turbo off                         
			}                      