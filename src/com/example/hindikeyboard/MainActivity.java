package com.example.hindikeyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	private HashMap<String, String> Dic_Tri_new;
	private HashMap<String, String> Dic_Bi_new;
	private HashMap<String, String> Dic_Uni_new;
	private HashMap<String, String> Dic_RegencyOfWord_new;

	private ArrayList<String> final_prob_smooth;
	private String user_typed_data = "";
	private String typed_string_temp = "";
	private ArrayList<String> word_coll = new ArrayList<String>();
	private String final_string="";
	private int windowSize = 7;

	public MainActivity() {

	}

	EditText output;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15,
			b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28,
			b29, b30, b31, b32, b33, b34, b35;
	Button b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46, b47, b48,
			b49, b50, b51, b52, b53, b54, b55, b56, b57, b58, b59, b60, b61,
			b62, b63, b64, b65;
	Button b66, b67, b68, b69, b70, b71;
	// ListView spin;
	TextView e1, e2, e3, e4, e5, e6, e7;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Toast.makeText(getApplicationContext(), "डिक्शनरी शुरू करने के लिए D बटन दबाए । ",Toast.LENGTH_LONG).show();				//message is thrown for the user for initialization of dictionary

		output = (EditText) findViewById(R.id.editText1);    // defining Edittext 
		b1 = (Button) findViewById(R.id.b1);                
		b2 = (Button) findViewById(R.id.b2);
		b3 = (Button) findViewById(R.id.b3);					 //defining Buttons 
		b4 = (Button) findViewById(R.id.b4);
		b5 = (Button) findViewById(R.id.b5);
		b6 = (Button) findViewById(R.id.b6);
		b7 = (Button) findViewById(R.id.b7);
		b8 = (Button) findViewById(R.id.b8);
		b9 = (Button) findViewById(R.id.b9);

		b10 = (Button) findViewById(R.id.b10);
		b11 = (Button) findViewById(R.id.b11);
		b12 = (Button) findViewById(R.id.b12);
		b13 = (Button) findViewById(R.id.b13);
		b14 = (Button) findViewById(R.id.b14);
		b15 = (Button) findViewById(R.id.b15);
		b16 = (Button) findViewById(R.id.b16);
		b17 = (Button) findViewById(R.id.b17);
		b18 = (Button) findViewById(R.id.b18);
		b19 = (Button) findViewById(R.id.b19);

		b20 = (Button) findViewById(R.id.b20);
		b21 = (Button) findViewById(R.id.b21);
		b22 = (Button) findViewById(R.id.b22);
		b23 = (Button) findViewById(R.id.b23);
		b24 = (Button) findViewById(R.id.b24);
		b25 = (Button) findViewById(R.id.b25);
		b26 = (Button) findViewById(R.id.b26);
		b27 = (Button) findViewById(R.id.b27);
		b28 = (Button) findViewById(R.id.b28);
		b29 = (Button) findViewById(R.id.b29);

		b30 = (Button) findViewById(R.id.b30);
		b31 = (Button) findViewById(R.id.b31);
		b32 = (Button) findViewById(R.id.b32);
		b33 = (Button) findViewById(R.id.b33);
		b34 = (Button) findViewById(R.id.b34);
		b35 = (Button) findViewById(R.id.b35);
		b36 = (Button) findViewById(R.id.b36);
		b37 = (Button) findViewById(R.id.b37);
		b38 = (Button) findViewById(R.id.b38);
		b39 = (Button) findViewById(R.id.b39);

		b40 = (Button) findViewById(R.id.b40);
		b41 = (Button) findViewById(R.id.b41);
		b42 = (Button) findViewById(R.id.b42);
		b43 = (Button) findViewById(R.id.b43);
		b44 = (Button) findViewById(R.id.b44);
		b45 = (Button) findViewById(R.id.b45);
		b46 = (Button) findViewById(R.id.b46);
		b47 = (Button) findViewById(R.id.b47);
		b48 = (Button) findViewById(R.id.b48);
		b49 = (Button) findViewById(R.id.b49);

		b50 = (Button) findViewById(R.id.b50);
		b51 = (Button) findViewById(R.id.b51);
		b52 = (Button) findViewById(R.id.b52);
		b53 = (Button) findViewById(R.id.b53);
		b54 = (Button) findViewById(R.id.b54);
		b55 = (Button) findViewById(R.id.b55);
		b56 = (Button) findViewById(R.id.b56);
		b57 = (Button) findViewById(R.id.b57);
		b58 = (Button) findViewById(R.id.b58);
		b59 = (Button) findViewById(R.id.b59);

		b60 = (Button) findViewById(R.id.b60);
		b61 = (Button) findViewById(R.id.b61);
		b62 = (Button) findViewById(R.id.b62);
		b63 = (Button) findViewById(R.id.b63);
		b64 = (Button) findViewById(R.id.b64);
		b65 = (Button) findViewById(R.id.b65);
		b66 = (Button) findViewById(R.id.b66);
		b67 = (Button) findViewById(R.id.b67);
		b68 = (Button) findViewById(R.id.b68);
		b69 = (Button) findViewById(R.id.b69);

		b70 = (Button) findViewById(R.id.b70);
		b71 = (Button) findViewById(R.id.b71);

		e1 = (TextView) findViewById(R.id.EditText07);
		e2 = (TextView) findViewById(R.id.EditText06);
		e3 = (TextView) findViewById(R.id.EditText05);
		e4 = (TextView) findViewById(R.id.EditText04);
		e5 = (TextView) findViewById(R.id.EditText03);
		e6 = (TextView) findViewById(R.id.EditText02);
		e7 = (TextView) findViewById(R.id.EditText01);
		
}


	public void ini_dic() throws IOException			//function to initialize dictionaries
	{
		Dic_Uni_new_Dic();
		Dic_Bi_new_Dic();
	//	Dic_Tri_new_Dic();
	//	Dic_RegencyOfWord();
		Toast.makeText(getApplicationContext(), "डिक्शनरी शुरू हो गया",Toast.LENGTH_LONG).show();				//message is thrown for the user that he could
	}																								//start typing as dictionary initialization is completed

	public final void Dic_Uni_new_Dic() 			//function to initialize uni_gram dictionary
	{
		Dic_Uni_new = new HashMap<String, String>();
		InputStream is = getResources().openRawResource(R.raw.new_uni);
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(is,"UTF-8"));
			String obj;
			obj = in.readLine();

			while ((obj = in.readLine()) != null)
			{
				if (!obj.equals("")) 
				{
					try {

						String[] key_value = obj.split("\t");
						if (key_value.length > 2) 
						{
							String word_key = key_value[1].toString();
							String prob_key = key_value[0].trim().toString() + "\t" + key_value[2].trim().toString();
							if (!word_key.equals("")) 
							{
								if (!Dic_Uni_new.containsKey(word_key)) 
								{												
									Dic_Uni_new.put(word_key, prob_key);			//storing the keys and their corresponding values in the hashmap Dic_Uni_new
								}
							}
						}
					}catch (Exception ee) 
					{
						System.out.println("some error occur mks");
					}

				}
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public final void Dic_Bi_new_Dic() 					//function to initialize bi_gram dictionary
	{
		int mycount=0;
		Dic_Bi_new = new HashMap<String, String>();
		InputStream is = getResources().openRawResource(R.raw.new_bi);
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(is,"UTF-16"));
			String obj;
			while ((obj = in.readLine()) != null)
			{
				mycount++;
				 if(mycount==300000)
				 {
					 return ;
				 }
				 
				if (obj != "")
				{
					System.out.println(mycount);
					
					try {
						String[] key_value = obj.split(" ");
						if (key_value.length > 3) 
						{
							String word_key = key_value[1].toString() + " " + key_value[2].toString();
							String prob_key = key_value[0].trim().toString() + "\t" + key_value[3].trim().toString();
							
							
							if (word_key != "") 
							{
								if (!Dic_Bi_new.containsKey(word_key))
								{
									Dic_Bi_new.put(word_key, prob_key);			//storing the keys and their corresponding values in the hashmap Dic_Bi_new				
								}
							}
						}

					} catch (Exception ee)
					{ }
				}
				
			}is.close();
		}catch(IOException e){
			e.printStackTrace();
		}

	}

	/*public final void Dic_Tri_new_Dic() 			//function to initialize tri_gram dictionary
	{
		Dic_Tri_new = new HashMap<String, String>();
		InputStream is = getResources().openRawResource(R.raw.new_output_tri);
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(is,"UTF-16"));
			String obj;
			while ((obj = in.readLine()) != null) 
			{
				if (obj != "") 
				{
					try {
						String[] key_value = obj.split(" ");
						if (key_value.length > 4) {
							String word_key = key_value[1].toString() + " " + key_value[2].toString() + " " + key_value[3].toString();
							String prob_key = key_value[0].toString();

							if (word_key != "") 
							{
								if (!Dic_Tri_new.containsKey(word_key))
								{
									Dic_Tri_new.put(word_key, prob_key);			//storing the keys and their corresponding values in the hashmap Dic_Uni_new
								}
							}
						}
						
					} 
					catch (Exception ee) 
					{  }
				}
			}
			is.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}*/

	public final void Dic_RegencyOfWord()			//function to initialize LRU dictionary
	{
		Dic_RegencyOfWord_new = new HashMap<String, String>();
		InputStream is = getResources().openRawResource(R.raw.regency_data);
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(is,"UTF-16"));
			String obj;
			while ((obj = in.readLine()) != null) 
			{

				if (obj != "")
				{
					try {
						String[] key_value = obj.split("\t");
						if (key_value.length > 1) {
							String word_key = key_value[0].toString();
							String LRU_key = key_value[1].toString();

							if (word_key != "") 
							{

								if (!Dic_RegencyOfWord_new.containsKey(word_key)) 
								{ 
									Dic_RegencyOfWord_new.put(word_key, LRU_key);		//storing the keys and their corresponding values in the hashmap Dic_RegencyOfWord_new
									
								}
							}
						}

					} catch (Exception ee) {
					}
				}
			}is.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void initialize(View sender) throws IOException 			//function for dictionary initialization 
	{
		final Button a = (Button) sender;							//when button D is pressed
		ini_dic();
	}

	public String typedString = "";

	public final String arpa_ngram(String text) 				// calculation starts from here
	{
		String newText = text;
		newText = text.replace("।", "");
		newText = newText.replace("?", "");
		newText = newText.replace("\"", "");
		newText = newText.replace("-", "");
		newText = newText.replace("\n","");
		final_prob_smooth = new ArrayList<String>();
		Arpa_prob(newText);
		word_coll.clear();
		String data_only = "";
		int count = 0;
		String output_string = "";
		for (String ob : final_prob_smooth) 
		{
			count++;
			if (count <= windowSize)
			{
				String dummy = ob.replace(" ", "[");
				data_only = dummy.substring(dummy.indexOf("[") + 1);
				word_coll.add(ob);
				output_string += data_only + "\t";
			} 
			else {
				break;
			}
		}
		output_string += characterSet;
		return output_string;
		
	}

	private void Arpa_prob(String text_sample)
	{
		String str = text_sample;
		
		System.out.print("\ninput text\t"+text_sample);
		String n_1 = "";
		String n_2 = "";
		String n_3 = "";
		String[] wordarray = str.split(" ");
		if (wordarray.length > 0) {
			n_1 = wordarray[wordarray.length - 1];
		}
		if (wordarray.length > 1) {
			n_2 = wordarray[wordarray.length - 2];
		}
		if (wordarray.length > 2) {
			n_3 = wordarray[wordarray.length - 3];
		}
		//AddingLruDataToDic(n_2); // updating lru
		ArrayList<String> arr_all_unique_word = new ArrayList<String>();
		
		 For_Error(n_1, arr_all_unique_word);
		
		String Tri_value = "";
		String bi_value = "";
		String uni_value = "";
		String cmp_string = "";
		String prb = "";
		if (n_2.equals(""))
		{
			n_2 = "<UNK>";
			n_3 = "<UNK>";
		}
		for (String obj : arr_all_unique_word) {
		/*	cmp_string = n_3 + " " + n_2 + " " + obj;
			Tri_value = Dic_Tri_new.get(cmp_string);
			if (Tri_value != null)

			{
				prb = Tri_value;
				Decider_my_method(n_1, prb, obj);
			}
			else {*/
				cmp_string = n_2 + " " + obj;
				bi_value = Dic_Bi_new.get(cmp_string);
				if (bi_value != null)
				{
					String v1 = bi_value.substring(0, bi_value.indexOf("\t"));
					String v2 = bi_value.substring(bi_value.indexOf("\t") + 1);
					prb = String.valueOf(Double.parseDouble(v1) + Double.parseDouble(v2));
					Decider_my_method(n_1, prb, obj);
				} 
				else {
					cmp_string = obj;
					uni_value = Dic_Uni_new.get(cmp_string);
					if (uni_value != null) {
						String v1 = uni_value.substring(0,uni_value.indexOf("\t"));
						String v2 = uni_value.substring(uni_value.indexOf("\t") + 1);
						prb = String.valueOf(Double.parseDouble(v1) + Double.parseDouble(v2));
						//prb = String.valueOf(Double.parseDouble(v1));
						Decider_my_method(n_1, prb, obj);
						int ch = 0;
					}
				}
	}
//}

		Collections.sort(final_prob_smooth);
		user_typed_data = n_1;

	}

	private void Decider_my_method(String n_1, String prb, String obj)
	{
		if (n_1.length() > 0 && obj.length() > 0) 
		{
			Error_Handling(final_prob_smooth, n_1, obj, prb);														
		} 
		else {
			final_prob_smooth.add(prb + "[" + obj);
		}
	}

	private void For_Correct(String n_1, ArrayList<String> arr_all_unique_word)
	{
		String chk = "";
		for (Map.Entry<String, String> data : Dic_Uni_new.entrySet()) {
			if (!data.getKey().toString().equals("") && data.getKey().length() >= n_1.length() && data.getKey().toString().length() > 1&& !data.getKey().toString().equals("<EOF>")&& !data.getKey().toString().equals("<UNK>")&& !data.getKey().toString().equals("<START>")&& !data.getKey().substring(0, 1).equals("॰")&& !data.getKey().substring(0, 1).equals("ं")&& !data.getKey().substring(0, 1).equals("ः")) 
			{
				chk = data.getKey().substring(0, n_1.length());
				if (n_1.equals(chk)) 
				{
					arr_all_unique_word.add(data.getKey());
				}
			}
		}
	}

	public final String Cal_phonatic_Seq(String source) {
		String str = "";
		for (char obj : source.toCharArray()) {
			switch (obj) {
			case 'क':
			case 'ख':
				str += 'क';
				break;
			case 'ग':
			case 'घ':
				str += 'ग';
				break;
			case 'च':
			case 'छ':
				str += 'च';
				break;
			case 'ज':
			case 'झ':
				str += 'ज';
				break;
			case 'ट':
			case 'ठ':
				str += 'ट';
				break;
			case 'ड':
			case 'ङ':
			case 'ढ':
				str += 'ड';
				break;
			case 'त':
			case 'थ':
				str += 'त';
				break;
			case 'द':
			case 'ध':
				str += 'द';
				break;
			case 'प':
			case 'फ':
				str += 'प';
				break;
			case 'ब':
			case 'भ':
			case 'व':
				str += 'ब';
				break;
			case 'ऋ':
			case 'र':
				str += 'ऋ';
				break;
			case 'स':
			case 'श':
			case 'ष':
				str += 'स';
				break;
			case 'न':
			case 'ण':
			case 'ञ':
				str += 'न';
				break;
			case 'अ':
			case 'आ':
				str += 'अ';
				break;
			case 'इ':
			case 'ई':
				str += 'इ';
				break;
			case 'उ':
			case 'ऊ':
				str += 'उ';
				break;
			case 'ए':
			case 'ऐ':
				str += 'ए';
				break;
			case 'ओ':
			case 'औ':
				str += 'ओ';
				break;
			case 'ी':
			case 'ि':
				str += 'ी';
				break;
			case 'ु':
			case 'ू':
				str += 'ु';
				break;
			case 'े':
			case 'ै':
				str += 'े';
				break;
			case 'ो':
			case 'ौ':
				str += 'ो';
				break;
			case 'ं':
				str += 'न';
				break;
			case 'ॅ':
			case 'ँ':
				str += 'ॅ';
				break;
			default:
				str += obj;
				break;
			}
		}
		String st = str;
		return st;
	}

	private static float Cal_EDScore_Method(String typedString,String targetString) 
	{
		int cost = myCostChecker(targetString, typedString);
		float EDscr = 0.0F;
		EDscr = (cost) / (float) (typedString.length());
		return EDscr;
	}

	private float Cal_phonatic_method(String source, String target)
	{
		String seq_source = "";
		String seq_target = "";
		float PEDscr = 0.0f;
		seq_source = Cal_phonatic_Seq(source);
		seq_target = Cal_phonatic_Seq(target);
		try
		{
			String targetString = seq_target.substring(0, seq_source.length());
			PEDscr = Cal_EDScore_Method(seq_source, targetString);
		} 
		catch (java.lang.Exception e) 
		{  }
		return PEDscr;
	}

	public static int min(int a, int b, int c) 
	{
		int val = 0;
		if (a < b) 
		{
			if (a < c)
			{
				val = a;
			} 
			else {
				val = c;
			}
		} 
		    else { 
			if (b < c) 
			{
				val = b;
			} 
			else {
				val = c;
			}
		}
		return val;
	}

	public static int myCostChecker(String str1, String str2) 
	{
		char[] arr2 = str2.toCharArray();
		String equl_Len = "";
		if (str2.length() < str1.length()) {
			equl_Len = str1.substring(0, str2.length());
		} 
		else {
				equl_Len = str1;
		     }
		char[] arr1 = equl_Len.toCharArray();
		int m = arr1.length;
		int n = arr2.length;
		int[][] d = new int[m + 1][n + 1];
		int cost;
		int x;
		int y;
		int z;
		int retCostDist = 0;
		try 
		{
			for (int i = 0; i <= m; i++) 
			{
				d[i][0] = i;
			}
			for (int j = 0; j <= n; j++)
			{
				d[0][j] = j;
			}
			for (int i = 1; i <= m; i++) 
			{
				for (int j = 1; j <= n; j++) 
				{
					if (arr1[i - 1] == arr2[j - 1])
					{
						cost = 0;
					} 
					else {
						cost = 1;
					}
					x = d[i - 1][j] + 1;
					y = d[i][j - 1] + 1;
					z = d[i - 1][j - 1] + cost;
					d[i][j] = min(x, y, z);
					retCostDist = d[i][j];
				}
			}
		} catch (RuntimeException ee)
		{ }
		return retCostDist;
	}

	public static int max(int val1, int val2) 
	{
		if (val1 > val2)
		{
			return val1;
		} 
		else {
			return val2;
		}
	}

	private void For_Error(String n_1, ArrayList<String> arr_all_unique_word) 
	{
		String chk = "";
		for (Map.Entry<String, String> data : Dic_Uni_new.entrySet()) 
		{
			if (n_1.length() > 0 || n_1.equals(" "))
			{
				if (!data.getKey().toString().equals("") && data.getKey().length() >= n_1.length() && data.getKey().toString().length() > 1 && !data.getKey().toString().equals("<EOF>") && !data.getKey().toString().equals("<UNK>") && !data.getKey().toString().equals("<START>") && !data.getKey().substring(0, 1).equals("॰") && !data.getKey().substring(0, 1).equals("ं") && !data.getKey().substring(0, 1).equals("ः")) 
				{
					chk = data.getKey().substring(0, 1);
					String source = n_1.substring(0, 1);
					String seq_source1 = Cal_phonatic_Seq(chk);
					String seq_source2 = Cal_phonatic_Seq(source);
					if (seq_source1.equals(seq_source2)) 
					{
						arr_all_unique_word.add(data.getKey());
					}
				}
			}
			else {
			}
		}
		if (arr_all_unique_word.isEmpty()) {
			for (Map.Entry<String, String> data1 : Dic_Uni_new.entrySet()) 
			{
				if (!data1.getKey().toString().equals("") && data1.getKey().length() >= n_1.length() && data1.getKey().toString().length() > 1 && !data1.getKey().toString().equals("<EOF>") && !data1.getKey().toString().equals("<UNK>") && !data1.getKey().toString().equals("<START>") && !data1.getKey().substring(0, 1).equals("॰") && !data1.getKey().substring(0, 1).equals("ं") && !data1.getKey().substring(0, 1).equals("ः")) 
				{
					chk = data1.getKey().substring(0, n_1.length());
					String seq_source1 = Cal_phonatic_Seq(chk);
					String seq_source2 = Cal_phonatic_Seq(n_1);
					if (seq_source1.equals(seq_source2)) 
					{
						arr_all_unique_word.add(data1.getKey());
					}
				}
			}
		}
		int ch = 0;
	}

	private void Error_Handling(ArrayList<String> final_prob_smooth,String typedString, String targetString, String frq)
																
	{
		String StrWordFrequency = frq;
		double EDscr = 0.0f;

		double PScore = 0.0f;

		String strEDscr = "";

		String str_obj = targetString;
		String s1 = typedString;
		String s2 = targetString;
		targetString = s2.substring(0, s1.length());

		String stt = "";
		String inpp = "";

		String st = phonatic_redudency_remove(str_obj.trim(), stt); 
		String inp = phonatic_redudency_remove(typedString.trim(), inpp);
		String Phonatic_text = "";
		if (st.length() >= inp.length()) 
		{
			Phonatic_text = st.toString();
			PScore = (double) Math.round(Cal_phonatic_method(inp, Phonatic_text));
			EDscr = (double) Math.round(Cal_EDScore_Method(typedString,targetString));
			strEDscr = String.valueOf(EDscr);
			if (strEDscr == "0") 
			{
				strEDscr = "0.0";
			}
			String timeNow = String.valueOf(java.lang.System.currentTimeMillis());
			String old_timeStamp = "";
	/*		old_timeStamp = Dic_RegencyOfWord_new.get(str_obj);
			if (old_timeStamp != null) 
			{
				int ch = 0;
			} 
			else {
				old_timeStamp = "624474492457194730";
			}
*/
			double probablity = Math.abs(Double.parseDouble(StrWordFrequency));
			//long oldTime = Long.parseLong(old_timeStamp);
			
		//	long newTime = Long.parseLong(timeNow);
			long oldTime = 0L;
			long newTime =  1L;  
			
			double LruScoreRaw = (double) (newTime - oldTime) / (double) newTime;
			double LruScore = 10 - (Math.abs(Math.log10((double) LruScoreRaw)));
			String Score = "";
			double lamda1 = 0.0f;
			double lamda2 = 0.0f;
			double lamda3 = 0.0f;
			double lamda4 = 0.0f;

			lamda1 = 918.96143;
			lamda2 = 313.10629;
			lamda3 = 14.83231;
			lamda4 = 9.5417032;
			
			double temp=PScore * lamda1 + Double.parseDouble(strEDscr) * lamda2 + probablity * lamda3 + LruScore * lamda4;
			 DecimalFormat frm = new DecimalFormat("000000.000000");
			 Score=frm.format(temp);
			
			String output_text = "";
			output_text = "P=" + Score + "\t[" + str_obj;
			
			final_prob_smooth.add(output_text);
		

		}
	}

	private void AddingLruDataToDic(String val) 
	{
		String LRU_key = String.valueOf(java.lang.System.currentTimeMillis());
		
		if (!Dic_RegencyOfWord_new.containsKey(val)) // update LRU
		{
			Dic_RegencyOfWord_new.put(val, LRU_key);
		} 
		else {
			Dic_RegencyOfWord_new.put(Dic_RegencyOfWord_new.get(val), LRU_key);
		}
	}

	private String phonatic_redudency_remove(String str_obj, String stt)
	
	{
		String st = str_obj;
		stt = st.replace("म्", "ं");
		stt = stt.replace("ण", "न");
		stt = stt.replace("न्", "ं");
		stt = stt.replace("रि", "ऋ");
		stt = stt.replace("री", "ऋ");// ऋ रि री
		stt = stt.replace("्", "");
		stt = removedupes(stt);
		return stt;
	}

	private String removedupes(String s) 
	{
		String sb = "";
		char lastChar = s.charAt(0);
		sb += lastChar;
		int len = s.length();
		for (int i = 1; i < len; i++) 
		{
			char c = s.charAt(i);
			if (c != lastChar) 
			{
				sb += c;
				lastChar = c;
			}
		}
		return sb;
	}

	public String characterSet = "";

	public void but_clicked(View sender) {

		final Button bt = (Button) sender;
		output.append(bt.getText());
		String str=output.getText().toString();
	
		String a2=arpa_ngram(str);

		final String[] a1=a2.split("\t");
		e1.setText(a1[0]);
		e2.setText(a1[1]);
		e3.setText(a1[2]);
		e4.setText(a1[3]);
		e5.setText(a1[4]);
		e6.setText(a1[5]);
		e7.setText(a1[6]);

		if(str.contains(" "))
		{
			int last = str.lastIndexOf(32);
			final_string = str.substring(0, last);

		}
	}
		
	
	public void set_output(View sender)      //function executed when listbox is clicked
	{
		final TextView text = (TextView) sender;
		output.setText(final_string+" "+text.getText()+" ");
		
		String Str = new String(output.getText().toString());			//for keeping the cursor on the right side 
		EditText etext = (EditText) findViewById(R.id.editText1);
		etext.setSelection(etext.getText().length());
		int b = output.getText().length();
		output.setText(Str.substring(0, b));
		etext.setSelection(etext.getText().length());
		String str=output.getText().toString();
		
		String a2=arpa_ngram(str);

		final String[] a1=a2.split("\t");
		e1.setText(a1[0]);
		e2.setText(a1[1]);
		e3.setText(a1[2]);
		e4.setText(a1[3]);
		e5.setText(a1[4]);
		e6.setText(a1[5]);
		e7.setText(a1[6]);

		if(str.contains(" "))
		{
			int last = str.lastIndexOf(32);
			final_string = str.substring(0, last);

		}

	}
	


	static short op = 0;

	public void op_clicked(View sender)     //function is executed when operators like backspace,enter or clear is pressed
	{

		final Button bt = (Button) sender;
		if (bt.getText().toString().equals("पिछे"))
			op = 0;
		else if (bt.getText().toString().equals("साफ"))
			op = 1;
		else if (bt.getText().toString().equals("←"))
			op = 2;
		else if(bt.getText().toString().equals("रिक्त"))
			op=3;
		switch (op) {
		case 0:
			String Str = new String(output.getText().toString());			// for backspace
			EditText etext = (EditText) findViewById(R.id.editText1);		////for keeping the cursor on the right side 
			etext.setSelection(etext.getText().length());
			int b = output.getText().length();
			b = b - 1;
			output.setText(Str.substring(0, b));
			etext.setSelection(etext.getText().length());
			if(b==0)
			{
				output.setText(" ");
			}
			final_string=Str;
			String str=output.getText().toString();
			
			String a2=arpa_ngram(str);

			final String[] a1=a2.split("\t");
			e1.setText(a1[0]);
			e2.setText(a1[1]);
			e3.setText(a1[2]);
			e4.setText(a1[3]);
			e5.setText(a1[4]);
			e6.setText(a1[5]);
			e7.setText(a1[6]);

			if(str.contains(" "))
			{
				int last = str.lastIndexOf(32);
				final_string = str.substring(0, last);

			}
			
			break;

		case 1:
			int a = output.getText().length();							//for clear
			a = 0;
			output.setText("");
			final_string="";
			break;
		case 2:
			output.append("\n");										//for entering newline 
		
			break;
		case 3:
			output.append(" ");											//for space
			String str2=output.getText().toString();
			
			String a22=arpa_ngram(str2);

			final String[] a12=a22.split("\t");
			e1.setText(a12[0]);
			e2.setText(a12[1]);
			e3.setText(a12[2]);
			e4.setText(a12[3]);
			e5.setText(a12[4]);
			e6.setText(a12[5]);
			e7.setText(a12[6]);

			if(str2.contains(" "))
			{
				int last = str2.lastIndexOf(32);
				final_string = str2.substring(0, last);

			}
			break;
			

		}

	}

}