package structural.proxy.protection;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Properties {
    public static Set<String> bannedSites = Stream.of("xyz.com", "tamilrockers.com", "torrent.com")
            .collect(Collectors.toCollection(HashSet::new));
}
