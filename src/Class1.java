import org.fnlp.app.keyword.AbstractExtractor;
import org.fnlp.app.keyword.WordExtract;

import edu.fudan.nlp.cn.tag.CWSTagger;
import edu.fudan.nlp.corpus.StopWords;

/**
 * �ؼ��ʳ�ȡʹ��ʾ��
 * @author jyzhao,ltian
 *
 */
public class Class1 {
	
	public static void main(String[] args) throws Exception {
		
		
		
		StopWords sw= new StopWords("models/stopwords");
		CWSTagger seg = new CWSTagger("models/seg.m");
		AbstractExtractor key = new WordExtract(seg,sw);
		
		System.out.println(key.extract("������ر��ش���·��ͨ�¹ʳ���������24Сʱ����������26����ҹ�Ѿ�ȫ���Ƴ��¹��ֳ���֮ǰ���µ�D301�ζ�����ͷ���ڳ�����", 3, true));
		
		System.out.println(key.extract("������ر��ش���·��ͨ�¹ʳ���������24Сʱ����������26����ҹ�Ѿ�ȫ���Ƴ��¹��ֳ���֮ǰ���µ�D301�ζ�����ͷ���ڳ�����", 20));
		
		//�����Ѿ��ֺôʵľ���
		sw=null;
		key = new WordExtract(seg,sw);
		System.out.println(key.extract("����� �ر� �ش� ��·��ͨ�¹ʳ���������24Сʱ����������26����ҹ�Ѿ�ȫ���Ƴ��¹��ֳ���֮ǰ���µ�D301�ζ�����ͷ���ڳ�����", 20));
		System.out.println(key.extract("�Լ��� �� ���� ���� ����", 5));
		
		key = new WordExtract();
		System.out.println(key.extract("", 5));
		
	}
}
