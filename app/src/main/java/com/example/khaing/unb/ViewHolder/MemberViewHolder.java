package com.example.khaing.unb.ViewHolder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.khaing.unb.Adapter.MemberRCAdapter;
import com.example.khaing.unb.ModelData.MemberModel;
import com.example.khaing.unb.R;
import com.example.khaing.unb.controller.ItemClickListener;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Khaing on 6/30/2018.
 */

public class MemberViewHolder extends BaseViewHolder{
    @BindView(R.id.tvMemName)
    TextView tvMemName;
    @BindView(R.id.tvPosition)
    TextView tvPosition;
    @BindView(R.id.imgProfile)
    ImageView imgProfile;

    @BindView(R.id.member_view)
    LinearLayout member_view;

//    ItemClickListener itemClickListener;
//    Context context;

//    String []profileUrls={"https://kpohttps://kpopinfo114.files.wordpress.com/2018/06/blackpink-square-up-jennie.jpgpinfo114.files.wordpress.com/2018/07/unb-black-heart-feel-dog.jpg",
//                            "https://kpopinfo114.files.wordpress.com/2018/07/unb-black-heart-euijin.jpg",
//                            "https://kpopinfo114.files.wordpress.com/2018/07/unb-black-heart-daewon.jpg",
//                            "https://kpopinfo114.files.wordpress.com/2018/07/unb-black-heart-marco.jpg",
//                            "https://kpopinfo114.files.wordpress.com/2018/07/unb-black-heart-hojung.jpg",
//                            "https://kpopinfo114.files.wordpress.com/2018/07/unb-black-heart-hansol.jpg",
//                            "https://kpopinfo114.files.wordpress.com/2018/07/unb-black-heart-jun.jpg",
//                            "https://kpopinfo114.files.wordpress.com/2018/07/unb-black-heart-chan.jpg",
//                            "https://kpopinfo114.files.wordpress.com/2018/07/unb-black-heart-kijung.jpg"};

//    String []memName={"Feel dog","Eui Jin","Dae won","Marco","Ho jung","Han sol","Jun","Chan","Ki joon"};
//    String []memPosition={"Leader","Main Dancer","Main Vocalist","Lead Rapper","Visual","Lead Dancer","Main Rapper","Main Vocalist","Maknae"};
    String []profileUrls={"https://kpopinfo114.files.wordpress.com/2018/06/blackpink-square-up-lisa.jpg",
                            "https://kpopinfo114.files.wordpress.com/2018/06/blackpink-square-up-jisoo.jpg",
                            "https://kpopinfo114.files.wordpress.com/2018/06/blackpink-square-up-jennie.jpg",
                            "https://kpopinfo114.files.wordpress.com/2018/06/blackpink-square-up-rose.jpg"};
    String []memName={"Lisa","Jisoo","Jenny","Rose"};
    String []memPosition={"Leader","Vocal","Rapper","Main Dancer"};


    public MemberViewHolder(View view) {
        super(view);
       // this.itemClickListener=clickListener;
        ButterKnife.bind(this,view);
    }

    @Override
    public void setData(Object data) {

    }



    public void setMemName(int postion){

        for(int i=0;i<memName.length;i++){
            if(postion==i){
                tvMemName.setText(memName[i].toString());
                tvPosition.setText(memPosition[i].toString());
                Glide.with(itemView).load(profileUrls[i]).into(imgProfile);
            }
        }

//        if(postion==0){
//            tvMemName.setText("JUN");
//            tvPosition.setText("Main rapper");
//            //imgProfile.setImageResource(R.drawable.jun);
//            Glide.with(itemView).load(profileUrls[0]).into(imgProfile);
//        }
//        else if(postion==1){
//            tvMemName.setText("Feeldog");
//            tvPosition.setText("Leader");
//            imgProfile.setImageResource(R.drawable.feeldog);
//        }
//        else if(postion==2){
//            tvMemName.setText("EuiJI");
//            tvPosition.setText("Leader");
//            imgProfile.setImageResource(R.drawable.euiju);
//        }
//        else if(postion==3){
//            tvMemName.setText("Hansol");
//            tvPosition.setText("Leader");
//            imgProfile.setImageResource(R.drawable.hansol);
//        }
//        else if(postion==4){
//            tvMemName.setText("Dae Won");
//            tvPosition.setText("Leader");
//            imgProfile.setImageResource(R.drawable.dw);
//        }
//        else if(postion==5){
//            tvMemName.setText("Ho jung");
//            tvPosition.setText("Leader");
//            imgProfile.setImageResource(R.drawable.hojung);
//        }
//        else if(postion==6){
//            tvMemName.setText("Marco");
//            tvPosition.setText("Leader");
//            imgProfile.setImageResource(R.drawable.marco);
//        }
//        else if(postion==7){
//            tvMemName.setText("Kijoon");
//            tvPosition.setText("Maknae");
//            imgProfile.setImageResource(R.drawable.kijoon);
//        }
//        else {
//            tvMemName.setText("Chen");
//            tvPosition.setText("Vocalist");
//            imgProfile.setImageResource(R.drawable.chen);
//        }
    }



}
