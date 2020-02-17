package com.simplielend.simplilend.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.simplielend.simplilend.Adapters.DrawerListItemAdapter;
import com.simplielend.simplilend.Loans.Active_Loans;
import com.simplielend.simplilend.Loans.ClosedLoans;
import com.simplielend.simplilend.Loans.DisbursementLoans;
import com.simplielend.simplilend.Loans.Rejected_Loans;
import com.simplielend.simplilend.Models.NavDataModel;
import com.simplielend.simplilend.R;
import com.simplielend.simplilend.Loans.UnderReview;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {

    //var
    LinearLayout newLoanBtn;
    LinearLayout activeloan;
    LinearLayout rejectedloan;
    LinearLayout closedloans;
    LinearLayout disburs;
    LinearLayout underev;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private NavDataModel navDataModel;
    private ActionBarDrawerToggle mDrawerToggle;
    private Toolbar toolbar;
    ImageView ham;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        NavDataModel[] drawerItem = new NavDataModel[9];
        navDataModel = new NavDataModel();
        navDataModel.setUserName("Simplilend  Borrower");
        drawerItem[0] = navDataModel;
        drawerItem[1] = new NavDataModel(R.drawable.ic_person_black_24dp, "DSA Profile");
        drawerItem[2] = new NavDataModel(R.drawable.ic_dashboard_black_24dp, "Dashboard");
        drawerItem[3] = new NavDataModel(R.drawable.ruppee, "Current Loan Details");
        drawerItem[4] = new NavDataModel(R.drawable.ic_pie_chart_black_24dp, "EMI Schedule");
        drawerItem[5] = new NavDataModel(R.drawable.ic_restore_black_24dp, "Payment History");
        drawerItem[6] = new NavDataModel(R.drawable.ic_remove_red_eye_black_24dp, "Site Visit(Office Use Only)");

        drawerItem[7] = new NavDataModel(R.drawable.ic_announcement_black_24dp, "Feedback Support");

        drawerItem[8]= new NavDataModel(R.drawable.ic_settings_black_24dp, "Logout");

        DrawerListItemAdapter drawerItemCustomAdapter = new DrawerListItemAdapter(this, R.layout.nav_header, drawerItem);
        mDrawerList.setAdapter(drawerItemCustomAdapter);
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        setupDrawerToggle();
        initialize();
    }
    void setupDrawerToggle(){

        mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout,toolbar,R.string.app_name, R.string.app_name);
        //This is necessary to change the icon of the Drawer Toggle upon state change.
        mDrawerToggle.syncState();
    }

    public void initialize(){
        newLoanBtn = (LinearLayout) findViewById(R.id.new_loan_application);
        activeloan=(LinearLayout) findViewById(R.id.active_loans);
        rejectedloan=(LinearLayout)findViewById(R.id.relo);
        closedloans=(LinearLayout)findViewById(R.id.closed_loans);
        disburs=(LinearLayout)findViewById(R.id.disburs);
        underev=(LinearLayout)findViewById(R.id.under_review);
        ham=(ImageView)findViewById(R.id.ham_icon);
        ham.setOnClickListener(this);
        disburs.setOnClickListener(this);
        closedloans.setOnClickListener(this);
        rejectedloan.setOnClickListener(this);
        activeloan.setOnClickListener(this);
        newLoanBtn.setOnClickListener(this);
        underev.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){

            case R.id.ham_icon:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;

            case R.id.new_loan_application:
                startActivity(new Intent(Dashboard.this, LoansCategory.class));
                break;

            case R.id.active_loans:
                startActivity(new Intent(Dashboard.this, Active_Loans.class));
                Toast.makeText(getApplicationContext(),"Active Loans",Toast.LENGTH_LONG).show();
                break;

            case R.id.relo:
                startActivity(new Intent(Dashboard.this, Rejected_Loans.class));
                Toast.makeText(getApplicationContext(),"Rejected Loans",Toast.LENGTH_LONG).show();
                break;

            case R.id.closed_loans:
                startActivity(new Intent(Dashboard.this, ClosedLoans.class));
                Toast.makeText(getApplicationContext(),"Closed Loans",Toast.LENGTH_LONG).show();
                break;

            case R.id.disburs:
                startActivity(new Intent(Dashboard.this, DisbursementLoans.class));
                Toast.makeText(getApplicationContext(),"Disbursement Loans",Toast.LENGTH_LONG).show();
                break;

            case R.id.under_review:
                startActivity(new Intent(Dashboard.this, UnderReview.class));
                Toast.makeText(getApplicationContext(),"Under Review Applications",Toast.LENGTH_LONG).show();
                break;
        }
    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
         return;
        }

    }
}
