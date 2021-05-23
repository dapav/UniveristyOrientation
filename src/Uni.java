import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Uni {

	
	ArrayList<String> university = new ArrayList<>();
	
	public Uni(int anIndicator) throws IOException {
		if(anIndicator == 1) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader("Anthrwpistikwn.txt"));
				String in;
				while(((in = reader.readLine()) != null)) {
					university.add(in);
				}
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
		}else if(anIndicator ==2) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader("Thetikwn.txt"));
				String in;
				while(((in = reader.readLine()) != null)) {
					university.add(in);
				}
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
		}else if(anIndicator ==3) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader("Ygeias.txt"));
				String in;
				while(((in = reader.readLine()) != null)) {
					university.add(in);
				}
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
		}else if(anIndicator ==4) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader("Oikonomias.txt"));
				String in;
				while(((in = reader.readLine()) != null)) {
					university.add(in);
				}
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
		}
	}
	
	public String selectFirst(ArrayList<Integer> a) {
		int index=findFirst(a);
		return university.get(index);
	}
	
	

	public int findFirst(ArrayList<Integer> a) {
			
			int maxScore=0;
			int var;
			int index=0;
			for(int i =0; i<a.size();i++) {
				var = a.get(i);
				if(var>maxScore) {
					maxScore = var;
				    index = i;
				}
			}
			return index;
			
	}
}
