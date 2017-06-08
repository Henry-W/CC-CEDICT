/**
 * 
 */
package cedict;

/**
 * @author henrywhite
 *
 */
public class Main implements CEDictController {
	
	public Main() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		CEDictUI ui = new CEDictUI(this);
	}

	@Override
	public String summaryStatistics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String lookupChinese(String chineseWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String lookupEnglish(String English) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String lookupPinyin(String pinyin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String lookupChinesePrefix(String chinesePrefix) {
		// TODO Auto-generated method stub
		return null;
	}
}
