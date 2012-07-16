package swing.model;

import java.util.ArrayList;
import java.util.List;

import swing.frame.MainFrame;

public class Main {
	
	static MainFrame mainFrame = new MainFrame();
	
	private static void loops(){
		for(int i = 0; i < 10; i++){
			
			List<String> setList = new ArrayList<String>();
			
			for(int j = 0; j < 10; j++){
				setList.add(String.valueOf(j+i));
			}
			
			mainFrame.setIter(String.valueOf(i+1));
			mainFrame.setPositiveSeedList(setList);
			mainFrame.setNegaiveSeedList(setList);
			mainFrame.setTopRankSeedList(setList);
			mainFrame.setPrecision("99%");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		mainFrame.setVisible(true);
		loops();
	}

}
