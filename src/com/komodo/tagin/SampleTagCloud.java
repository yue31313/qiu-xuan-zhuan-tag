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
		
		//Step0: 得到一个全屏视图:
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		//Step1: 得到屏幕分辨率
		Display display = getWindowManager().getDefaultDisplay(); 
		int width = display.getWidth();
		int height = display.getHeight();
		
		//Step2: 创建所需的标记列表:
		//注意: 所有标签必须有独特的文本字段
		//如果没有,只有第一次出现将被添加,其余的将被忽略
		List<Tag> myTagList= createTags();
		
		//Step3: 创建TagCloudview MainActivity并将它设置为内容
		mTagCloudView = new TagCloudView(this, width, height, myTagList ); //通过当前上下文 
		setContentView(mTagCloudView);
		mTagCloudView.requestFocus();
		mTagCloudView.setFocusableInTouchMode(true);
		
		//Step4: (可选择) 添加一个新的标签,整个3 d TagCloud重置
		//您还可以添加个人标签:
		//mTagCloudView.addTag(new Tag("AAA", 5, "http://www.aaa.com"));
		// .... (可以添加其他几个tasg相似 )
		//如果旧标签不动indivual标记将被放置在前面的 因此,在添加许多个人标签 后，TagCloud代码可能不是均匀分布的。reset()re-positions所有标签
		//mTagCloudView.reset();
		
		//Step5: (可选择) 替换之前的标签之一,用一个新的标签，你一定要创建一个新的标签并且把他们放一起通过现有的文本标签，你想取代的
		//Tag newTag=new Tag("Illinois", 9, "http://www.illinois.com");
		//为了用Google去替代以前的标签
		//boolean result=mTagCloudView.Replace(newTag, "google");
		//如果Google被发现并且替换了将返回true，否则为false
	}

	protected void onResume() {
		super.onResume();
	}
	
	protected void onPause() {
		super.onPause();
	}
	
	private List<Tag> createTags(){
		//创建的列表标记人气值和相关的url
		List<Tag> tempList = new ArrayList<Tag>();

		tempList.add(new Tag("Google", 7, "Google"));  //1,4,7,... 假定受欢迎的值
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