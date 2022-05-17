package exploratory.socialnetwork;

import com.complexible.pinto.RDFMapper;
import org.junit.Test;
import org.openrdf.model.Graph;

public class SocialNetworkTest {
    @Test
    public void runPinto(){
        SocialNetwork socialNetwork = new SocialNetwork();
        User u1 = new User("Elek", "Test", "Péter");
        User u2 = new User("Izidor", "Budavári", "Tamás");
        u1.getFriends().add(u2);
        u2.getFriends().add(u1);

        Page p1 = new Page("Mém oldal", 420, PageTopic.MEMES);
        Page p2 = new Page("Thanos was right", 121, PageTopic.POLITICS);

        u2.getLikes().add(p1);
        u2.getLikes().add(p1);
        u2.getLikes().add(p2);

        socialNetwork.getUsers().add(u1);
        socialNetwork.getUsers().add(u2);
        socialNetwork.getPages().add(p1);
        socialNetwork.getPages().add(p2);
        Graph pGraph = RDFMapper.create().writeValue(p2);
        System.out.println(pGraph.toString());
        Graph snGraph = RDFMapper.create().writeValue(socialNetwork);
        System.out.println(snGraph.toString());
    }
}
