package swing.model;

import java.util.ArrayList;
import java.util.List;

import swing.frame.MainFrame;
import swing.frame.MidIterPopupFrame;

public class Main {
	
	static MainFrame mainFrame = new MainFrame();
	static List<String> strings;
	static boolean nextIterBegain;
	
	public static void init(List<String> strings){
		Main.strings = strings;
		nextIterBegain = true;
		loops();
	}
	
	public static void iterBegin(){
		nextIterBegain = true;
	}
	
	private static void loops(){
		for(int i = 0; i < 10; i++){
			
			while(true){
				if(nextIterBegain){
					break;
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			nextIterBegain = false;
			
			List<String> setList = new ArrayList<String>();
			
			/*
			 * compute
			 */
			for(int j = 0; j < 10; j++){
				setList.add(String.valueOf(j+i));
			}
			
			mainFrame.setIter(String.valueOf(i+1));
			mainFrame.setPositiveSeedList(setList);
			mainFrame.setNegaiveSeedList(setList);
			mainFrame.setTopRankSeedList(setList);
			mainFrame.setPrecision("99%");
			
			
			Thread nThread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					MidIterPopupFrame mid = new MidIterPopupFrame();
					mid.setVisible(true);
				}
			});
			nThread.start();
		}
	}
	
	public static void main(String[] args) {
		mainFrame.setVisible(true);
	}

}
