package simpleboard;

import java.util.ArrayList;
import java.util.List;

public class SimpleBoard {

	List<Article> list = new ArrayList<Article>();

	public boolean add(Article article) {
		list.add(article);
		return true;
	}

	public Article get(long l) {
		for (Article article : list) {
			if (article.getId() == l) {
				return article;
			}
		}
		return null;
	}

	public long size() {
		return list.size();
	}

	public boolean delete(long l) {
		for (Article article : list) {
			if (article.getId() == l) {
				list.remove(article);
				return true;
			}
		}
		return false;
	}

	public boolean update(Article record) {
		for (Article article : list) {
			if (article.getId() == record.getId()) {
				int idx = list.indexOf(article);
				list.remove(article);
				article = record;
				list.add(idx, record);
				return true;
			}
		}
		return false;
	}

	public List<Article> getList() {
		return list;
	}

}
