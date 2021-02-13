package com.inforegistru.levelstat.Views;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.widget.Toolbar;

import com.inforegistru.levelstat.Helpers.Utils;
import com.inforegistru.levelstat.R;
import com.inforegistru.levelstat.Retrofit.Scientist;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_cer_selective_agricult;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_cont_national;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_centru;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_centru_calarasi;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_centru_causeni;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_centru_cimislia;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_centru_criuleni;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_centru_dubasari;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_centru_hancesti;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_centru_ialoveni;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_centru_nisporeni;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_centru_orhei;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_centru_stefanvoda;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_centru_straseni;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_centru_ungheni;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_nord;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_nord_anenii_noi2;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_nord_balti;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_nord_briceni;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_nord_donduseni;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_nord_drochia;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_nord_edinet;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_nord_falesti;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_nord_floresti;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_nord_glodeni;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_nord_ocnita;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_nord_rascani;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_nord_rezina;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_nord_sangerei;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_nord_soldanesti;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_nord_soroca;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_nord_telenesti;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_sud;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_sud_basarabeasca;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_sud_cahul;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_sud_cantemir;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_sud_leova;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_sud_taraclia;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_crs_sud_uta_gagauzia;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dg_agricultura;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dg_colect_data;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dg_com_intern;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dg_constructie;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dg_industrie;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dg_it;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dg_registre;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dg_sit_fin;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dg_social_demo;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dg_stat_int;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dg_structurala;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dg_transport;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dir_com_ext;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dir_macro;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dir_pret;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dr_admin_sistem;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dr_app;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dr_colect_data_pret;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dr_colect_valid_data;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dr_diseminare;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dr_management_financiar;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dr_met_stat;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dr_nivel_trai;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dr_poligrafica;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dr_servicii_sociale;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dr_stat_ocuparii;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dr_stat_pop_mig;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_dr_stat_salariu;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_mun_chi_cer_gospodarii;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_mun_chi_generalizare;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_mun_chi_industrie;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_mun_chi_pm;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_mun_chi_servicii;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_mun_chi_sit_fin_botanica;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_mun_chi_sit_fin_buiucani;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_mun_chi_sit_fin_centru;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_mun_chi_sit_fin_ciocana;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_mun_chi_sit_fin_rascani;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_mun_chisinau;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_mun_chisinau_admin;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_recesaminte;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_sec_admin_achiz;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_sec_cer_sondaj;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_sec_colect_data_gosp;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_sec_edu;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_sec_finante;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_sec_instruire;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_sec_juridica;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_sec_stat_agric;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_sec_stat_med;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_ser_man_doc;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_ser_sistem_geografic;
import com.inforegistru.levelstat.Views.structbns.ScientistsActivity_ser_surse_date_admin;


public class structurabns  extends BaseActivity{

    private Scientist receivedScientist;
    RelativeLayout layout_mRelativeLayout3_str,layout_mRelativeLayout4_str, layout_mRelativeLayout7_str, layout_dir_international,
            layout_mRelativeLayout11_str, layout_mRelativeLayout13_str, layout_mRelativeLayout15_str, layout_mRelativeLayout17_str,
            layout_mRelativeLayout_dir_comert_exter, layout_mRelativeLayout_stat_int, layout_mRelativeLayout_industrie, layout_mRelativeLayout_constructie,
            layout_mRelativeLayout_structurala, layout_mRelativeLayout_com_intern , layout_mRelativeLayout_transpost, layout_mRelativeLayout_registre,
            layout_mRelativeLayout_agricultura , layout_mRelativeLayout_stat_agriculturii, layout_mRelativeLayout_cer_selec_agr,
            layout_mRelativeLayout_sec_stat_med, layout_mRelativeLayout_dg_col_tata, layout_mRelativeLayout_dr_sit_fin,
            layout_mRelativeLayout_dr_colect_data , layout_mRelativeLayout_dr_colect_data_pret, layout_mRelativeLayout_dr_sociala_demografie,
            layout_mRmRelativeLayout_dr_niv_trai , layout_mRelativeLayout_dr_stat_ocuparii, layout_mRelativeLayout_dr_stat_salariu,
            layout_mRelativeLayout_dr_pop_migratie, layout_mRelativeLayout_dr_serv_social, layout_mRelativeLayout_serv_edu,
            layout_mRelativeLayout_dr_recesaminte, layout_mRelativeLayout_dr_diseminare , layout_mRelativeLayout_dr_met_statistice,
            layout_mRelativeLayout_sec_cer_sondaj , layoutmRelativeLayout_servicu_sur_date_admin, layout_mRelativeLayout_servicu_sist_geografic,
            layout_mRelativeLayout_sec_colect_data_gosp, layout_mRelativeLayout_dr_management_fin, layout_mRelativeLayout_sec_finante,
            layout_mRelativeLayout_sec_admin_achiz, layout_mRelativeLayout_sec_juridica, layout_mRelativeLayout_ser_man_doc,
            layout_mRelativeLayout_dg_it, layout_mRelativeLayout_dg_app, layout_mRelativeLayout_dr_admin_sis_info, layout_mRelativeLayout_sec_instruire_stat,
            layout_mRelativeLayout_des_poligrafica, layout_mRelativeLayout_mun_Chisinau, layout_mRelativeLayout_mun_Chisinau_admin,
            layout_mRelativeLayout_mun_Chisinau_dr_generalizare, layout_mRelativeLayout_mun_Chisinau_dr_industrie, layout_mRelativeLayout_mun_Chisinau_dr_pm,
            layout_mRelativeLayout_mun_Chisinau_dr_servicii, layout_mRelativeLayout_mun_Chisinau_Botanica, layout_mRelativeLayout_mun_Chisinau_Buiucani,
            layout_mRelativeLayout_mun_Chisinau_Centru, layout_mRelativeLayout_mun_Chisinau_Ciocana, layout_mRelativeLayout_mun_Chisinau_Rascani,
            layout_mRelativeLayout_mun_Chisinau_cercetari_gosp, layout_mRelativeLayout_crs_nord, layout_mRelativeLayout_crs_nord_balti,
            layout_mRelativeLayout_crs_nord_briceni, layout_mRelativeLayout_crs_nord_donduseni,layout_mRelativeLayout_crs_nord_drochia,
            layout_mRelativeLayout_crs_nord_edinet, layout_mRelativeLayout_crs_nord_falesti, layout_mRelativeLayout_crs_nord_floresti, layout_mRelativeLayout_crs_nord_glodeni,
            layout_mRelativeLayout_crs_nord_ocnnita, layout_mRelativeLayout_crs_nord_rezina , layout_mRelativeLayout_crs_nord_rascani,
            layout_mRelativeLayout_crs_nord_sangerei, layout_mRelativeLayout_crs_nord_soroca, layout_mRelativeLayout_crs_nord_soldanesti,
            layout_mRelativeLayout_crs_nord_telenesti, layout_mRelativeLayout_crs_centru, layout_mRelativeLayout_crs_centru_aneniinoi,
            layout_mRelativeLayout_crs_centru_calarasi, layout_mRelativeLayout_crs_centru_causeni,  layout_mRelativeLayout_crs_centru_cimislia,
            layout_mRelativeLayout_crs_centru_criuleni, layout_mRelativeLayout_crs_centru_dubasari, layout_mRelativeLayout_crs_centru_hancesti,
            layout_mRelativeLayout_crs_centru_ialoveni, layout_mRelativeLayout_crs_centru_nisporeni, layout_mRelativeLayout_crs_centru_orhei,
            layout_mRelativeLayout_crs_centru_straseni, layout_mRelativeLayout_crs_centru_stefan_voda, layout_mRelativeLayout_crs_centru_ungheni,
            layout_mRelativeLayout_crs_sud, layout_mRelativeLayout_crs_sud_basarabeasca, layout_mRelativeLayout_crs_sud_cahul, layout_mRelativeLayout_crs_sud_cantemir,
            layout_mRelativeLayout_crs_sud_uta_gagauzia, layout_mRelativeLayout_crs_leova, layout_mRelativeLayout_crs_taraclia;



    private void initializeWidgets(){

        Toolbar toolbar = findViewById(R.id.aboutUsToolBar_str);
        setSupportActionBar(toolbar);

        findViewById(R.id.mBackArrow_str).setOnClickListener(v -> finish());


        layout_mRelativeLayout3_str  = findViewById(R.id.mRelativeLayout3_str);
        layout_mRelativeLayout4_str  = findViewById(R.id.mRelativeLayout5_str);
        layout_mRelativeLayout7_str   = findViewById(R.id.mRelativeLayout7_str);
        layout_dir_international      = findViewById(R.id.mRelativeLayout9_str);
        layout_mRelativeLayout11_str  = findViewById(R.id.mRelativeLayout11_str);
        layout_mRelativeLayout13_str  = findViewById(R.id.mRelativeLayout13_str);
        layout_mRelativeLayout15_str  = findViewById(R.id.mRelativeLayout15_str);
        layout_mRelativeLayout17_str  = findViewById(R.id.mRelativeLayout17_str);
        layout_mRelativeLayout_dir_comert_exter  = findViewById(R.id.mRelativeLayout_dir_comert_exter);
        layout_mRelativeLayout_stat_int   = findViewById(R.id.mRelativeLayout_stat_int);
        layout_mRelativeLayout_industrie = findViewById(R.id.mRelativeLayout_industrie);
        layout_mRelativeLayout_constructie  = findViewById(R.id.mRelativeLayout_constructie);
        layout_mRelativeLayout_structurala = findViewById(R.id.mRelativeLayout_structurala);
        layout_mRelativeLayout_com_intern = findViewById(R.id.mRelativeLayout_com_intern);
        layout_mRelativeLayout_transpost  = findViewById(R.id.mRelativeLayout_transpost);
        layout_mRelativeLayout_registre   = findViewById(R.id.mRelativeLayout_registre);
        layout_mRelativeLayout_stat_agriculturii   = findViewById(R.id.mRelativeLayout_stat_agriculturii);
        layout_mRelativeLayout_agricultura  = findViewById(R.id.mRelativeLayout_agricultura);
        layout_mRelativeLayout_cer_selec_agr = findViewById(R.id.mRelativeLayout_cer_selec_agr);
        layout_mRelativeLayout_sec_stat_med  = findViewById(R.id.mRelativeLayout_sec_stat_med);
        layout_mRelativeLayout_dg_col_tata = findViewById(R.id.mRelativeLayout_dg_col_tata );
        layout_mRelativeLayout_dr_sit_fin  =  findViewById(R.id.mRelativeLayout_dr_sit_fin );
        layout_mRelativeLayout_dr_colect_data  =  findViewById(R.id.mRelativeLayout_dr_colect_data );
        layout_mRelativeLayout_dr_colect_data_pret =  findViewById(R.id.mRelativeLayout_dr_colect_data_pret);
        layout_mRelativeLayout_dr_sociala_demografie =  findViewById(R.id.mRelativeLayout_dr_sociala_demografie);
        layout_mRmRelativeLayout_dr_niv_trai  =  findViewById(R.id.mRelativeLayout_dr_niv_trai);
        layout_mRelativeLayout_dr_stat_ocuparii  =  findViewById(R.id.mRelativeLayout_dr_stat_ocuparii);
        layout_mRelativeLayout_dr_stat_salariu  =  findViewById(R.id.mRelativeLayout_dr_stat_salariu);
        layout_mRelativeLayout_dr_pop_migratie  =  findViewById(R.id.mRelativeLayout_dr_pop_migratie);
        layout_mRelativeLayout_dr_serv_social   =  findViewById(R.id.mRelativeLayout_dr_serv_social);
        layout_mRelativeLayout_serv_edu   =  findViewById(R.id.mRelativeLayout_serv_edu);
        layout_mRelativeLayout_dr_recesaminte =  findViewById(R.id.mRelativeLayout_dr_recesaminte);
        layout_mRelativeLayout_dr_diseminare  =  findViewById(R.id.mRelativeLayout_dr_diseminare);
        layout_mRelativeLayout_dr_met_statistice =  findViewById(R.id.mRelativeLayout_dr_met_statistice);
        layout_mRelativeLayout_sec_cer_sondaj =  findViewById(R.id.mRelativeLayout_sec_cer_sondaj);
        layoutmRelativeLayout_servicu_sur_date_admin =  findViewById(R.id.mRelativeLayout_servicu_sur_date_admin);
        layout_mRelativeLayout_servicu_sist_geografic =  findViewById(R.id.mRelativeLayout_servicu_sist_geografic);
        layout_mRelativeLayout_sec_colect_data_gosp  =  findViewById(R.id.mRelativeLayout_sec_colect_data_gosp);
        layout_mRelativeLayout_dr_management_fin   =  findViewById(R.id.mRelativeLayout_dr_management_fin);
        layout_mRelativeLayout_sec_finante  =  findViewById(R.id.mRelativeLayout_sec_finante);
        layout_mRelativeLayout_sec_admin_achiz =  findViewById(R.id.mRelativeLayout_sec_admin_achiz);
        layout_mRelativeLayout_sec_juridica =  findViewById(R.id.mRelativeLayout_sec_juridica);
        layout_mRelativeLayout_ser_man_doc =  findViewById(R.id.mRelativeLayout_ser_man_doc);
        layout_mRelativeLayout_dg_it  =  findViewById(R.id.mRelativeLayout_dg_it);
        layout_mRelativeLayout_dg_app  =  findViewById(R.id.mRelativeLayout_dg_app);
        layout_mRelativeLayout_dr_admin_sis_info =  findViewById(R.id.mRelativeLayout_dr_admin_sis_info);
        layout_mRelativeLayout_sec_instruire_stat =  findViewById(R.id.mRelativeLayout_sec_instruire_stat);
        layout_mRelativeLayout_des_poligrafica  =  findViewById(R.id.mRelativeLayout_des_poligrafica);
        layout_mRelativeLayout_mun_Chisinau =  findViewById(R.id.mRelativeLayout_mun_Chisinau);
        layout_mRelativeLayout_mun_Chisinau_admin  =  findViewById(R.id.mRelativeLayout_mun_Chisinau_admin);
        layout_mRelativeLayout_mun_Chisinau_dr_generalizare =  findViewById(R.id.mRelativeLayout_mun_Chisinau_dr_generalizare);
        layout_mRelativeLayout_mun_Chisinau_dr_industrie  =  findViewById(R.id.mRelativeLayout_mun_Chisinau_dr_industrie);
        layout_mRelativeLayout_mun_Chisinau_dr_pm  =  findViewById(R.id.mRelativeLayout_mun_Chisinau_dr_pm);
        layout_mRelativeLayout_mun_Chisinau_dr_servicii =  findViewById(R.id.mRelativeLayout_mun_Chisinau_dr_servicii);
        layout_mRelativeLayout_mun_Chisinau_Botanica  =  findViewById(R.id.mRelativeLayout_mun_Chisinau_Botanica);
        layout_mRelativeLayout_mun_Chisinau_Buiucani  =  findViewById(R.id.mRelativeLayout_mun_Chisinau_Buiucani);
        layout_mRelativeLayout_mun_Chisinau_Centru =  findViewById(R.id.mRelativeLayout_mun_Chisinau_Centru);
        layout_mRelativeLayout_mun_Chisinau_Ciocana =  findViewById(R.id.mRelativeLayout_mun_Chisinau_Ciocana);
        layout_mRelativeLayout_mun_Chisinau_Rascani =  findViewById(R.id.mRelativeLayout_mun_Chisinau_Rascani);
        layout_mRelativeLayout_mun_Chisinau_cercetari_gosp =  findViewById(R.id.mRelativeLayout_mun_Chisinau_cercetari_gosp);
        layout_mRelativeLayout_crs_nord  =  findViewById(R.id.mRelativeLayout_crs_nord);
        layout_mRelativeLayout_crs_nord_balti  =  findViewById(R.id.mRelativeLayout_crs_nord_balti);
        layout_mRelativeLayout_crs_nord_briceni  =  findViewById(R.id.mRelativeLayout_crs_nord_briceni);
        layout_mRelativeLayout_crs_nord_donduseni =  findViewById(R.id.mRelativeLayout_crs_nord_donduseni);
        layout_mRelativeLayout_crs_nord_drochia  =  findViewById(R.id.mRelativeLayout_crs_nord_drochia);
        layout_mRelativeLayout_crs_nord_edinet   =  findViewById(R.id.mRelativeLayout_crs_nord_edinet);
        layout_mRelativeLayout_crs_nord_falesti  =  findViewById(R.id.mRelativeLayout_crs_nord_falesti);
        layout_mRelativeLayout_crs_nord_floresti   =  findViewById(R.id.mRelativeLayout_crs_nord_floresti);
        layout_mRelativeLayout_crs_nord_glodeni  =  findViewById(R.id.mRelativeLayout_crs_nord_glodeni);
        layout_mRelativeLayout_crs_nord_ocnnita   =  findViewById(R.id.mRelativeLayout_crs_nord_ocnnita);
        layout_mRelativeLayout_crs_nord_rezina   =  findViewById(R.id.mRelativeLayout_crs_nord_rezina);
        layout_mRelativeLayout_crs_nord_rascani  =  findViewById(R.id.mRelativeLayout_crs_nord_rascani);
        layout_mRelativeLayout_crs_nord_sangerei  =  findViewById(R.id.mRelativeLayout_crs_nord_sangerei);
        layout_mRelativeLayout_crs_nord_soroca   =  findViewById(R.id.mRelativeLayout_crs_nord_soroca);
        layout_mRelativeLayout_crs_nord_soldanesti   =  findViewById(R.id.mRelativeLayout_crs_nord_soldanesti);
        layout_mRelativeLayout_crs_nord_telenesti  =  findViewById(R.id.mRelativeLayout_crs_nord_telenesti);
        layout_mRelativeLayout_crs_centru =  findViewById(R.id.mRelativeLayout_crs_centru);
        layout_mRelativeLayout_crs_centru_aneniinoi   =  findViewById(R.id.mRelativeLayout_crs_centru_aneniinoi);
        layout_mRelativeLayout_crs_centru_calarasi   =  findViewById(R.id.mRelativeLayout_crs_centru_calarasi);
        layout_mRelativeLayout_crs_centru_causeni   =  findViewById(R.id.mRelativeLayout_crs_centru_causeni);
        layout_mRelativeLayout_crs_centru_cimislia =  findViewById(R.id.mRelativeLayout_crs_centru_cimislia);
        layout_mRelativeLayout_crs_centru_criuleni =  findViewById(R.id.mRelativeLayout_crs_centru_criuleni);
        layout_mRelativeLayout_crs_centru_dubasari  =  findViewById(R.id.mRelativeLayout_crs_centru_dubasari);
        layout_mRelativeLayout_crs_centru_hancesti  =  findViewById(R.id.mRelativeLayout_crs_centru_hancesti);
        layout_mRelativeLayout_crs_centru_ialoveni =  findViewById(R.id.mRelativeLayout_crs_centru_ialoveni);
        layout_mRelativeLayout_crs_centru_nisporeni =  findViewById(R.id.mRelativeLayout_crs_centru_nisporeni);
        layout_mRelativeLayout_crs_centru_orhei  =  findViewById(R.id.mRelativeLayout_crs_centru_orhei);
        layout_mRelativeLayout_crs_centru_straseni  =  findViewById(R.id.mRelativeLayout_crs_centru_straseni);
        layout_mRelativeLayout_crs_centru_stefan_voda  =  findViewById(R.id.mRelativeLayout_crs_centru_stefan_voda);
        layout_mRelativeLayout_crs_centru_ungheni  =  findViewById(R.id.mRelativeLayout_crs_centru_ungheni);
        layout_mRelativeLayout_crs_sud  =  findViewById(R.id.mRelativeLayout_crs_sud);
        layout_mRelativeLayout_crs_sud_basarabeasca =  findViewById(R.id.mRelativeLayout_crs_sud_basarabeasca);
        layout_mRelativeLayout_crs_sud_cahul  =  findViewById(R.id.mRelativeLayout_crs_sud_cahul);
        layout_mRelativeLayout_crs_sud_cantemir  =  findViewById(R.id.mRelativeLayout_crs_sud_cantemir);
        layout_mRelativeLayout_crs_sud_uta_gagauzia =  findViewById(R.id.mRelativeLayout_crs_sud_uta_gagauzia);
        layout_mRelativeLayout_crs_leova =  findViewById(R.id.mRelativeLayout_crs_leova);
        layout_mRelativeLayout_crs_taraclia =  findViewById(R.id.mRelativeLayout_crs_taraclia);


        layout_mRelativeLayout_crs_taraclia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_sud_taraclia.class);

            }
        });



        layout_mRelativeLayout_crs_leova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_sud_leova.class);

            }
        });


        layout_mRelativeLayout_crs_sud_uta_gagauzia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_sud_uta_gagauzia.class);

            }
        });

        layout_mRelativeLayout_crs_sud_cantemir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_sud_cantemir.class);

            }
        });

        layout_mRelativeLayout_crs_sud_cahul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_sud_cahul.class);

            }
        });

        layout_mRelativeLayout_crs_sud_basarabeasca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_sud_basarabeasca.class);

            }
        });

        layout_mRelativeLayout_crs_sud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_sud.class);

            }
        });


        layout_mRelativeLayout_crs_centru_ungheni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_centru_ungheni.class);

            }
        });



        layout_mRelativeLayout_crs_centru_stefan_voda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_centru_stefanvoda.class);

            }
        });



        layout_mRelativeLayout_crs_centru_straseni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_centru_straseni.class);

            }
        });

        layout_mRelativeLayout_crs_centru_orhei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_centru_orhei.class);

            }
        });

        layout_mRelativeLayout_crs_centru_nisporeni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_centru_nisporeni.class);

            }
        });

        layout_mRelativeLayout_crs_centru_ialoveni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_centru_ialoveni.class);

            }
        });



        layout_mRelativeLayout_crs_centru_hancesti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_centru_hancesti.class);

            }
        });



        layout_mRelativeLayout_crs_centru_dubasari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_centru_dubasari.class);

            }
        });


        layout_mRelativeLayout_crs_centru_criuleni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_centru_criuleni.class);

            }
        });



        layout_mRelativeLayout_crs_centru_cimislia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_centru_cimislia.class);

            }
        });

        layout_mRelativeLayout_crs_centru_causeni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_centru_causeni.class);

            }
        });

        layout_mRelativeLayout_crs_centru_calarasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_centru_calarasi.class);

            }
        });

        layout_mRelativeLayout_crs_centru_aneniinoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_nord_anenii_noi2.class);

            }
        });

        layout_mRelativeLayout_crs_centru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_centru.class);

            }
        });



        layout_mRelativeLayout_crs_nord_telenesti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_nord_telenesti.class);

            }
        });


        layout_mRelativeLayout_crs_nord_soldanesti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_nord_soldanesti.class);

            }
        });

        layout_mRelativeLayout_crs_nord_soroca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_nord_soroca.class);

            }
        });
        layout_mRelativeLayout_crs_nord_sangerei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_nord_sangerei.class);

            }
        });


        layout_mRelativeLayout_crs_nord_rascani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_nord_rascani.class);

            }
        });
        layout_mRelativeLayout_crs_nord_rezina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_nord_rezina.class);

            }
        });


        layout_mRelativeLayout_crs_nord_ocnnita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_nord_ocnita.class);

            }
        });

        layout_mRelativeLayout_crs_nord_glodeni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_nord_glodeni.class);

            }
        });


        layout_mRelativeLayout_crs_nord_floresti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_nord_floresti.class);

            }
        });

        layout_mRelativeLayout_crs_nord_falesti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_nord_falesti.class);

            }
        });
        layout_mRelativeLayout_crs_nord_edinet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_nord_edinet.class);

            }
        });

        layout_mRelativeLayout_crs_nord_drochia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_nord_drochia.class);

            }
        });

        layout_mRelativeLayout_crs_nord_donduseni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_nord_donduseni.class);

            }
        });

        layout_mRelativeLayout_crs_nord_briceni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_nord_briceni.class);

            }
        });

        layout_mRelativeLayout_crs_nord_balti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_nord_balti.class);

            }
        });



        layout_mRelativeLayout_crs_nord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_crs_nord.class);

            }
        });


        layout_mRelativeLayout_mun_Chisinau_cercetari_gosp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_mun_chi_cer_gospodarii.class);

            }
        });

        layout_mRelativeLayout_mun_Chisinau_Rascani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_mun_chi_sit_fin_rascani.class);

            }
        });

        layout_mRelativeLayout_mun_Chisinau_Ciocana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_mun_chi_sit_fin_ciocana.class);

            }
        });


        layout_mRelativeLayout_mun_Chisinau_Centru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_mun_chi_sit_fin_centru.class);

            }
        });

        layout_mRelativeLayout_mun_Chisinau_Buiucani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_mun_chi_sit_fin_buiucani.class);

            }
        });

        layout_mRelativeLayout_mun_Chisinau_Botanica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_mun_chi_sit_fin_botanica.class);

            }
        });



        layout_mRelativeLayout_mun_Chisinau_dr_servicii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_mun_chi_servicii.class);

            }
        });


        layout_mRelativeLayout_mun_Chisinau_dr_pm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_mun_chi_pm.class);

            }
        });


        layout_mRelativeLayout_mun_Chisinau_dr_industrie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_mun_chi_industrie.class);

            }
        });


        layout_mRelativeLayout_mun_Chisinau_dr_generalizare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_mun_chi_generalizare.class);

            }
        });


        layout_mRelativeLayout_mun_Chisinau_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_mun_chisinau_admin.class);

            }
        });

        layout_mRelativeLayout_mun_Chisinau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_mun_chisinau.class);

            }
        });

        layout_mRelativeLayout_des_poligrafica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dr_poligrafica.class);

            }
        });

        layout_mRelativeLayout_sec_instruire_stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_sec_instruire.class);

            }
        });


        layout_mRelativeLayout_dr_admin_sis_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dr_admin_sistem.class);

            }
        });


        layout_mRelativeLayout_dg_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dr_app.class);

            }
        });


        layout_mRelativeLayout_dg_it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dg_it.class);

            }
        });



        layout_mRelativeLayout_ser_man_doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_ser_man_doc.class);

            }
        });

        layout_mRelativeLayout_sec_juridica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_sec_juridica.class);

            }
        });

        layout_mRelativeLayout_sec_admin_achiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_sec_admin_achiz.class);

            }
        });



        layout_mRelativeLayout_sec_finante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_sec_finante.class);

            }
        });


        layout_mRelativeLayout_dr_management_fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dr_management_financiar.class);

            }
        });


        layout_mRelativeLayout_sec_colect_data_gosp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_sec_colect_data_gosp.class);

            }
        });


        layout_mRelativeLayout_servicu_sist_geografic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_ser_sistem_geografic.class);

            }
        });



        layoutmRelativeLayout_servicu_sur_date_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_ser_surse_date_admin.class);

            }
        });

        layout_mRelativeLayout_sec_cer_sondaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_sec_cer_sondaj.class);

            }
        });


        layout_mRelativeLayout_dr_met_statistice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dr_met_stat.class);

            }
        });


        layout_mRelativeLayout_dr_diseminare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dr_diseminare.class);

            }
        });


        layout_mRelativeLayout_dr_recesaminte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_recesaminte.class);

            }
        });


        layout_mRelativeLayout_serv_edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_sec_edu.class);

            }
        });


        layout_mRelativeLayout_dr_serv_social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dr_servicii_sociale.class);

            }
        });

        layout_mRelativeLayout_dr_pop_migratie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dr_stat_pop_mig.class);

            }
        });

        layout_mRelativeLayout_dr_stat_salariu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dr_stat_salariu.class);

            }
        });



        layout_mRelativeLayout_dr_stat_ocuparii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dr_stat_ocuparii.class);

            }
        });

        layout_mRmRelativeLayout_dr_niv_trai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dr_nivel_trai.class);

            }
        });


        layout_mRelativeLayout_dr_sociala_demografie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dg_social_demo.class);

            }
        });

        layout_mRelativeLayout_dr_colect_data_pret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dr_colect_data_pret.class);

            }
        });



        layout_mRelativeLayout_dr_colect_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dr_colect_valid_data.class);

            }
        });


        layout_mRelativeLayout_dr_sit_fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dg_sit_fin.class);

            }
        });

        layout_mRelativeLayout_dg_col_tata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dg_colect_data.class);

            }
        });

        layout_mRelativeLayout_sec_stat_med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_sec_stat_med.class);

            }
        });

        layout_mRelativeLayout_cer_selec_agr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_cer_selective_agricult.class);

            }
        });

        layout_mRelativeLayout_stat_agriculturii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_sec_stat_agric.class);

            }
        });


        layout_mRelativeLayout_agricultura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dg_agricultura.class);

            }
        });


        layout_mRelativeLayout_registre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dg_registre.class);

            }
        });


        layout_mRelativeLayout_transpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dg_transport.class);

            }
        });

        layout_mRelativeLayout_com_intern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dg_com_intern.class);

            }
        });



        layout_mRelativeLayout_structurala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dg_structurala.class);

            }
        });



        layout_mRelativeLayout_constructie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dg_constructie.class);

            }
        });



        layout_mRelativeLayout_industrie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dg_industrie.class);

            }
        });





        layout_mRelativeLayout_stat_int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dg_stat_int.class);

            }
        });


        layout_mRelativeLayout_dir_comert_exter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dir_com_ext.class);

            }
        });

        layout_mRelativeLayout17_str.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dir_pret.class);

            }
        });



        layout_mRelativeLayout15_str.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_cont_national.class);

            }
        });


        layout_mRelativeLayout13_str.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivity_dir_macro.class);

            }
        });


        layout_mRelativeLayout11_str.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this,ScientistsActivity_sec_audit.class);

            }
        });


        layout_dir_international.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this,ScientistsActivity_direc_international.class);

            }
        });


        layout_mRelativeLayout7_str.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this,ScientistsActivitystr3.class);

            }
        });


        layout_mRelativeLayout3_str.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this,ScientistsActivitystr.class);

            }
        });


        layout_mRelativeLayout4_str.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openActivity(structurabns.this, ScientistsActivitystr2.class);

            }
        });


    };


    /**
     * Let's inflate our menu for the detail page
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detail_page_menu, menu);
        return true;
    }

    /**
     * When a menu item is selected we want to navigate to the appropriate page
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_edit:
                Utils.sendScientistToActivity(this,receivedScientist,help.class);
                finish();
                return true;


            case R.id.action_edit_en:
                Utils.sendScientistToActivity(this,receivedScientist,helpen.class);
                finish();
                return true;

            case R.id.action_edit_ru:
                Utils.sendScientistToActivity(this,receivedScientist,helpru.class);
                finish();
                return true;

            case android.R.id.home:
//                //NavUtils.navigateUpFromSameTask(this);
//                Utils.sendScientistToActivity(this,receivedScientist,ScientistsActivitystr.class);
//                finish();


                Intent intent;
                intent = new Intent(this, DashboardActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                finish();
                startActivity(intent);
                return true;

            case R.id.video3:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(com.inforegistru.levelstat.Helpers.Utils.youtube_level_stat ));
                startActivity(browserIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        Intent intent;
        intent = new Intent(this,DashboardActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
        startActivity(intent);
    }
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_structura_bns);
//        Toolbar toolbar = findViewById(R.id.aboutUsToolBar_str);
//        setSupportActionBar(toolbar);
//
//        findViewById(R.id.mBackArrow_str).setOnClickListener(v -> finish());


        this.initializeWidgets();
    }
}
