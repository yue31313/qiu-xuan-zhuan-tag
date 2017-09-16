package com.komodo.tagin;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;

public class SampleTagCloud extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Step0: �õ�һ��ȫ����ͼ:
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		//Step1: �õ���Ļ�ֱ���
		Display display = getWindowManager().getDefaultDisplay(); 
		int width = display.getWidth();
		int height = display.getHeight();
		
		//Step2: ��������ı���б�:
		//ע��: ���б�ǩ�����ж��ص��ı��ֶ�
		//���û��,ֻ�е�һ�γ��ֽ������,����Ľ�������
		List<Tag> myTagList= createTags();
		
		//Step3: ����TagCloudview MainActivity����������Ϊ����
		mTagCloudView = new TagCloudView(this, width, height, myTagList ); //ͨ����ǰ������ 
		setContentView(mTagCloudView);
		mTagCloudView.requestFocus();
		mTagCloudView.setFocusableInTouchMode(true);
		
		//Step4: (��ѡ��) ���һ���µı�ǩ,����3 d TagCloud����
		//����������Ӹ��˱�ǩ:
		//mTagCloudView.addTag(new Tag("AAA", 5, "http://www.aaa.com"));
		// .... (���������������tasg���� )
		//����ɱ�ǩ����indivual��ǽ���������ǰ��� ���,����������˱�ǩ ��TagCloud������ܲ��Ǿ��ȷֲ��ġ�reset()re-positions���б�ǩ
		//mTagCloudView.reset();
		
		//Step5: (��ѡ��) �滻֮ǰ�ı�ǩ֮һ,��һ���µı�ǩ����һ��Ҫ����һ���µı�ǩ���Ұ����Ƿ�һ��ͨ�����е��ı���ǩ������ȡ����
		//Tag newTag=new Tag("Illinois", 9, "http://www.illinois.com");
		//Ϊ����Googleȥ�����ǰ�ı�ǩ
		//boolean result=mTagCloudView.Replace(newTag, "google");
		//���Google�����ֲ����滻�˽�����true������Ϊfalse
	}

	protected void onResume() {
		super.onResume();
	}
	
	protected void onPause() {
		super.onPause();
	}
	
	private List<Tag> createTags(){
		//�������б�������ֵ����ص�url
		List<Tag> tempList = new ArrayList<Tag>();

		tempList.add(new Tag("Google", 7, "Google"));  //1,4,7,... �ٶ��ܻ�ӭ��ֵ
		tempList.add(new Tag("Yahoo", 3, "Yahoo"));
		tempList.add(new Tag("CNN", 4, "CNN"));
		tempList.add(new Tag("MSNBC", 5, "MSNBC"));
		tempList.add(new Tag("CNBC", 5, "CNBC"));
		tempList.add(new Tag("Facebook", 7, "Facebook"));
		tempList.add(new Tag("Youtube", 3, "Youtube"));
		tempList.add(new Tag("BlogSpot", 5, "BlogSpot"));
		tempList.add(new Tag("Bing", 3, "Bing"));
		tempList.add(new Tag("Wikipedia", 8, "Wikipedia"));
		tempList.add(new Tag("Twitter", 5, "Twitter"));
		tempList.add(new Tag("Msn", 1, "Msn"));
		tempList.add(new Tag("Amazon", 3, "Amazon"));
		tempList.add(new Tag("Ebay", 7, "Ebay"));
		tempList.add(new Tag("LinkedIn", 5, "LinkedIn"));
		tempList.add(new Tag("Live", 7, "Live"));
		tempList.add(new Tag("Microsoft", 3, "Microsoft"));
		tempList.add(new Tag("Flicker", 1, "Flicker"));
		tempList.add(new Tag("Apple", 5, "Apple"));
		tempList.add(new Tag("Paypal", 5, "Paypal"));
		tempList.add(new Tag("Craigslist", 7, "Craigslist"));
		tempList.add(new Tag("Imdb", 2, "Imdb"));
		tempList.add(new Tag("Ask", 4, "Ask"));
		tempList.add(new Tag("Weibo", 1, "Weibo"));
		tempList.add(new Tag("Tagin!", 8, "Tagin"));
		tempList.add(new Tag("Shiftehfar", 8, "Shiftehfar"));
		tempList.add(new Tag("Soso", 5, "Soso"));
		tempList.add(new Tag("XVideos", 3, "XVideos"));
		tempList.add(new Tag("BBC", 5, "BBC"));
		return tempList;
	}
	
	private TagCloudView mTagCloudView;
}