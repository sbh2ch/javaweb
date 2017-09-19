package simpleboard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sonbyeonghwa on 2017. 9. 19..
 */
public class SimpleBoard {

    private List<Article> store = new ArrayList<Article>();

    public boolean add(Article article) {
        return store.add(article);
    }

    public Article get(long l) {
        return store.get((int) l);
    }

    public long size() {
        return store.size();
    }

    public boolean delete(long l) {
        return store.remove(l);
    }

    public void update(Article article2) {
    }

    public List<Article> getStore() {
        return store;
    }
}
