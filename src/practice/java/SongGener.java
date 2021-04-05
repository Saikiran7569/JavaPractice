package practice.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SongGener {

	public static void main(String[] args) {

		Map<String, List<String>> peronSogList = new HashMap<>();

		peronSogList.put("John", Arrays.asList("song1", "song2", "song3", "song4", "song8"));
		peronSogList.put("Jyotsna", Arrays.asList("song5", "song6", "song7"));

		Map<String, List<String>> output = findFavoriteGenre(peronSogList);
		
		output.forEach((k,v)-> System.out.println(k+":"+ v) );

	}

	private static Map<String, List<String>> findFavoriteGenre(Map<String, List<String>> peronSogList) {

		Map<String, List<String>> output = new HashMap<>();
		Map<String, List<String>> generList = new HashMap<>();
		generList.put("Rock", Arrays.asList("song1", "song3"));
		generList.put("Dubstep", Arrays.asList("song7"));
		generList.put("Techno", Arrays.asList("song2", "song4"));
		generList.put("Pop", Arrays.asList("song5", "song6"));
		generList.put("Jazz", Arrays.asList("song8", "song9"));

		for (Entry<String, List<String>> e : peronSogList.entrySet()) {
			String name = e.getKey();
			List<String> songs = e.getValue();
			List<String> outGenere = new ArrayList<String>();
			for (Entry<String, List<String>> gener : generList.entrySet()) {
				List<String> songsGener = gener.getValue();
				if (songs.containsAll(songsGener)) {
					outGenere.add(gener.getKey());
				}

			}
			output.put(name, outGenere);

		}

		return output;
	}

}
