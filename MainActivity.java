package com.sdewry.emah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.DialogInterface;

import com.sdewry.emah.R;

public class MainActivity extends AppCompatActivity {
    private long backPressedTime;
    private Toast backToast;
   Button dshe;
   Button dc;
   Button deodeo;
   Button useo;
   Button school;
   Button college;
   Button madrasha;
    Button other;
    Button locall;
   Button ministry;
   Button emergency;
   ImageView youtube;
   ImageView websiet;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dshe=findViewById(R.id.dshe);
        dc=findViewById(R.id.dc);
        deodeo=findViewById(R.id.deodeo);
        useo=findViewById(R.id.useo);
        school=findViewById(R.id.school);
        college=findViewById(R.id.college);
        madrasha=findViewById(R.id.madrasha);
        other=findViewById(R.id.other);
        locall=findViewById(R.id.locall);
        ministry=findViewById(R.id.ministry);
        emergency=findViewById(R.id.emergency);
        youtube = findViewById(R.id.sunirmalssessionlogo);
        websiet = findViewById(R.id.sdewrylogo);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/@sunirmalssession9744");
            }
        });
        websiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("http://www.sdewry.com");
            }
        });
        dshe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent pass=new Intent(MainActivity.this,dir.class);
               startActivity(pass);
            }
        });
        deodeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pass=new Intent(MainActivity.this,deop.class);
                startActivity(pass);
            }
        });

        useo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pass=new Intent(MainActivity.this,useop.class);
                startActivity(pass);
            }
        });
        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pass=new Intent(MainActivity.this,scl.class);
                startActivity(pass);
            }
        });
        college.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pass=new Intent(MainActivity.this,coll.class);
                startActivity(pass);
            }
        });
        madrasha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pass=new Intent(MainActivity.this,mad.class);
                startActivity(pass);
            }
        });
        dc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pass=new Intent(MainActivity.this,dcp.class);
                startActivity(pass);
            }
        });


        locall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pass=new Intent(MainActivity.this,local.class);
                startActivity(pass);
            }
        });
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pass=new Intent(MainActivity.this,otherp.class);
                startActivity(pass);
            }
        });

        ministry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pass=new Intent(MainActivity.this,ministryp.class);
                startActivity(pass);
            }
        });
        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pass=new Intent(MainActivity.this,Emergencyp.class);
                startActivity(pass);
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        int item_id=item.getItemId();
        switch (item_id)
        {
            case R.id.item1:
                Intent intent=new Intent(MainActivity.this,About.class);
                startActivity(intent);
                //Toast.makeText(this, "good", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Intent pass=new Intent(MainActivity.this,PrivacyPolicy.class);
                startActivity(pass);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(" আপনি কি App টি বন্ধ করতে চান?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }


//@Override
    //public void onBackPressed(){
      //  showExitDialog();
  //  }
    //private void showExitDialog(){
      //  AlertDialog.Builder builder = new AlertDialog.Builder(this);
       // builder.setMessage("Are you sure you want to exit?")
           //     .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
               //     @Override
               //     public void onClick(DialogInterface dialog, int id) {
                //        finish();
                //    }
               // })
               // .setNegativeButton("No", new DialogInterface.OnClickListener() {
               //     @Override
                //    public void onClick(DialogInterface dialog, int id) {
                //        dialog.dismiss();

                //    }
             //   });
     //   AlertDialog dialog = builder.create();
     //   dialog.show();

       //  super.onBackPressed();

  //  }

   // @Override
    //public void onBackPressed() {
      //  super.onBackPressed();
   // }
    //@Override
    //public void onBackPressed() {

       // if (backPressedTime + 2000 > System.currentTimeMillis()) {
           // backToast.cancel();
           // super.onBackPressed();
           // return;
        //} else {
        //    backToast = Toast.makeText(getBaseContext(),"Press back again to exit",Toast.LENGTH_SHORT);
        //    backToast.show();
        //}
       // backPressedTime = System.currentTimeMillis();
   // }
    //  @Override
   // public void onBackPressed() {
//final AlertDialog.Builder alart = new AlertDialog.Builder(this);
//View myview = getLayoutInflater().inflate(R.layout.alartbox,null);
//alart.setView(myview);

//final AlertDialog dialog = alart.create();
//dialog.setCancelable(false);
//myview.findViewById(R.id.yes).setOnClickListener(new View.OnClickListener() {
 //   @Override
  //  public void onClick(View view) {
 //       dialog.dismiss();
//    }
//});
 //       myview.findViewById(R.id.no).setOnClickListener(new View.OnClickListener() {
  //          @Override
   //         public void onClick(View view) {
   //             dialog.dismiss();
   //         }
   //     });

     //   dialog.show();
   // }

}

