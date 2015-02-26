package com.cricketism.scorer;

import java.io.IOException;


public class Cacher implements Runnable {
	public static Boolean state = false;
	public static DataPojo data = new DataPojo();

	@Override
	public void run() {
		while (true) {
			
			synchronized (state) {
				state = false;
			}
			synchronized (data) {
			    DataPojo tData=null;
                try {
                    tData = MainClass.process();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
			    if (tData!=null)
			        data = tData;
			}
			synchronized (state) {
				state = true;
			}
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
