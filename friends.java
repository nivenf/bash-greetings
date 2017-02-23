import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class friends {
	private static final String users_FILENAME = "users_online.txt";
	private static final String favs_FILENAME = "favorites.txt";
	
	private static Set<String> users;
	private static Set<String> favs;
	private static Set<String> favs_online;
	
	private static String whoami = "";
	
	public static void main(String[] args) throws IOException {
		//whoami = args[0];
		whoami = "nivenf";
		
		users = new HashSet<String>();
		favs = new HashSet<String>();
		favs_online = new HashSet<String>();
		
		try {
			BufferedReader rb = new BufferedReader(new FileReader(users_FILENAME));
			String line;
			
			while((line = rb.readLine()) != null)
				users.add(line);
			
			rb = new BufferedReader(new FileReader(favs_FILENAME));
			
			while((line = rb.readLine()) != null)
				favs.add(line);
			
			for(String user_name : users) {
				for(String fav_name : favs) {
					if(user_name.equals(fav_name) && !user_name.equals(whoami) && !fav_name.equals(whoami)) {
						favs_online.add(user_name);
					}
				}
			}	
			
			if(favs_online.size() == 0)
				System.out.println("No friends online");
			else {
				System.out.println("Friends online:");
				for(String f : favs_online) {
					System.out.println("  " + f);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
