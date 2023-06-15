package com.example.test.ui.map;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.test.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class gMap extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {

            //Barclays Banks - Red
            LatLng BarclaysBank1 = new LatLng(52.484024202546166, -1.8980563532468904);
            LatLng BarclaysBank2 = new LatLng(52.48057428712574, -1.8949664485709858);
            LatLng BarclaysBank3 = new LatLng(52.48872819667489, -1.9126475697719958);
            LatLng BarclaysATM1 = new LatLng(52.4797379032503, -1.9117892629175774);
            LatLng BarclaysBank4 = new LatLng(52.47022291754667, -1.8566859628639454);
            LatLng BarclaysATM3 = new LatLng(52.475451186329686, -1.9222606065414765);
            LatLng BarclaysBank5 = new LatLng(52.506076357986586, -1.9399417277424862);
            LatLng BarclaysBank6 = new LatLng(52.4618563954876, -1.944748246127227);
            LatLng BarclaysATM4 = new LatLng(52.47963335414791, -1.8494761852868342);
            LatLng BarclaysBank7 = new LatLng(52.45034983101871, -1.8237269796542954);
            LatLng BarclaysBank8 = new LatLng(52.43632868078145, -1.8934214962330331);
            LatLng BarclaysBank9 = new LatLng(52.54545007440841, -1.8844951049470864);
            LatLng BarclaysATM5 = new LatLng(52.49155035168896, -1.961399399102935);
            LatLng BarclaysATM6 = new LatLng(52.463320651642064, -1.9445765847563432);
            LatLng BarclaysBank10 = new LatLng(52.52373100921095, -1.9967616436535693);
            LatLng BarclaysATM7 = new LatLng(52.46729481571144, -1.8426097304514906);
            LatLng BarclaysATM8 = new LatLng(52.45788174042577, -1.8676722906004946);
            LatLng BarclaysLocal = new LatLng(52.509315315836645, -1.7622722063894611);
            LatLng BarclaysBank11 = new LatLng(52.416021495346115, -1.8268168818416912);

            Marker markerBarclaysBank1;
            Marker markerBarclaysBank2;
            Marker markerBarclaysBank3;
            Marker markerBarclaysATM1;
            Marker markerBarclaysBank4;
            Marker markerBarclaysATM3;
            Marker markerBarclaysBank5;
            Marker markerBarclaysBank6;
            Marker markerBarclaysATM4;
            Marker markerBarclaysBank7;
            Marker markerBarclaysBank8;
            Marker markerBarclaysBank9;
            Marker markerBarclaysATM5;
            Marker markerBarclaysATM6;
            Marker markerBarclaysBank10;
            Marker markerBarclaysATM7;
            Marker markerBarclaysATM8;
            Marker markerBarclaysLocal;
            Marker markerBarclaysBank11;

            markerBarclaysBank1 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysBank1)
                    .title("Barclay Bank"));
            markerBarclaysBank1.setTag(0);

            markerBarclaysBank2 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysBank2)
                    .title("Barclay Bank"));
            markerBarclaysBank2.setTag(0);

            markerBarclaysBank3 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysBank3)
                    .title("Barclay Bank"));
            markerBarclaysBank3.setTag(0);

            markerBarclaysATM1 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysATM1)
                    .title("Barclay ATM"));
            markerBarclaysATM1.setTag(0);

            markerBarclaysBank4 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysBank4)
                    .title("Barclay Bank"));
            markerBarclaysBank4.setTag(0);

            markerBarclaysATM3 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysATM3)
                    .title("Barclay ATM"));
            markerBarclaysATM3.setTag(0);

            markerBarclaysBank5 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysBank5)
                    .title("Barclay Bank"));
            markerBarclaysBank5.setTag(0);

            markerBarclaysBank6 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysBank6)
                    .title("Barclay Bank"));
            markerBarclaysBank6.setTag(0);

            markerBarclaysATM4 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysATM4)
                    .title("Barclay ATM"));
            markerBarclaysATM4.setTag(0);

            markerBarclaysBank7 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysBank7)
                    .title("Barclay Bank"));
            markerBarclaysBank7.setTag(0);

            markerBarclaysBank8 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysBank8)
                    .title("Barclay Bank"));
            markerBarclaysBank8.setTag(0);

            markerBarclaysBank9 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysBank9)
                    .title("Barclay Bank"));
            markerBarclaysBank9.setTag(0);

            markerBarclaysATM5 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysATM5)
                    .title("Barclay ATM"));
            markerBarclaysATM5.setTag(0);

            markerBarclaysATM6 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysATM6)
                    .title("Barclay ATM"));
            markerBarclaysATM6.setTag(0);

            markerBarclaysBank10 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysBank10)
                    .title("Barclay Bank"));
            markerBarclaysBank10.setTag(0);

            markerBarclaysATM7 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysATM7)
                    .title("Barclay ATM"));
            markerBarclaysATM7.setTag(0);

            markerBarclaysATM8 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysATM8)
                    .title("Barclay ATM"));
            markerBarclaysATM8.setTag(0);

            markerBarclaysLocal = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysLocal)
                    .title("Barclay Local"));
            markerBarclaysLocal.setTag(0);

            markerBarclaysBank11 = googleMap.addMarker(new MarkerOptions()
                    .position(BarclaysBank11)
                    .title("Barclay Bank"));
            markerBarclaysBank11.setTag(0);

            //Royal Bank of Scotland - Green
            LatLng RoyalBankOfScotlandBank1 = new LatLng(52.47849038974494, -1.895915926913194);

            Marker markerRoyalBankOfScotlandBank1;

            markerRoyalBankOfScotlandBank1 = googleMap.addMarker(new MarkerOptions()
                    .position(RoyalBankOfScotlandBank1)
                    .title("Royal Bank of Scotland - Birmingham")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            markerRoyalBankOfScotlandBank1.setTag(0);

            //HSBC Banks - Blue
            LatLng HSBCBank1 = new LatLng(52.479206496948144, -1.8975301824612485);
            LatLng HSBCBank2 = new LatLng(52.48776675292687, -1.913055432737135);
            LatLng HSBCBank3 = new LatLng(52.4773682175163, -1.8961278292253294);
            LatLng HSBCBank4 = new LatLng(52.4592652462162, -1.9478451395149419);
            LatLng HSBCBank5 = new LatLng(52.482039680310535, -1.901879965304664);
            LatLng HSBCBank6 = new LatLng(52.520867091364146, -1.9983417625085018);

            Marker markerHSBCBank1;
            Marker markerHSBCBank2;
            Marker markerHSBCBank3;
            Marker markerHSBCBank4;
            Marker markerHSBCBank5;
            Marker markerHSBCBank6;

            markerHSBCBank1 = googleMap.addMarker(new MarkerOptions()
                    .position(HSBCBank1)
                    .title("HSBC Bank - Birmingham")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
            markerHSBCBank1.setTag(0);

            markerHSBCBank2 = googleMap.addMarker(new MarkerOptions()
                    .position(HSBCBank2)
                    .title("HSBC Bank - Birmingham")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
            markerHSBCBank2.setTag(0);

            markerHSBCBank3 = googleMap.addMarker(new MarkerOptions()
                    .position(HSBCBank3)
                    .title("HSBC Bank - Birmingham")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
            markerHSBCBank3.setTag(0);

            markerHSBCBank4 = googleMap.addMarker(new MarkerOptions()
                    .position(HSBCBank4)
                    .title("HSBC Bank - Birmingham")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
            markerHSBCBank4.setTag(0);

            markerHSBCBank5 = googleMap.addMarker(new MarkerOptions()
                    .position(HSBCBank5)
                    .title("HSBC Bank - Birmingham")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
            markerHSBCBank5.setTag(0);

            markerHSBCBank6 = googleMap.addMarker(new MarkerOptions()
                    .position(HSBCBank6)
                    .title("HSBC Bank - Birmingham")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
            markerHSBCBank6.setTag(0);

            //Lloyds Banks - Orange
            LatLng LloydsBank1 = new LatLng(52.4794035660983, -1.8979492320993785);
            LatLng LloydsBank2 = new LatLng(52.47804439804427, -1.8558921962753674);
            LatLng LloydsBank3 = new LatLng(52.52386988362544, -1.8403649557546506);
            LatLng LloydsBank4 = new LatLng(52.47731252095694, -1.904987348305606);
            LatLng LloydsBank5 = new LatLng(52.50396590317463, -1.933483135872282);
            LatLng LloydsBank6 = new LatLng(52.472398173696405, -1.9180336124927586);

            Marker markerLloydsBank1;
            Marker markerLloydsBank2;
            Marker markerLloydsBank3;
            Marker markerLloydsBank4;
            Marker markerLloydsBank5;
            Marker markerLloydsBank6;

            markerLloydsBank1 = googleMap.addMarker(new MarkerOptions()
                    .position(LloydsBank1)
                    .title("Lloyds Bank - Birmingham")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
            markerLloydsBank1.setTag(0);

            markerLloydsBank2 = googleMap.addMarker(new MarkerOptions()
                    .position(LloydsBank2)
                    .title("Lloyds Bank - Birmingham")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
            markerLloydsBank2.setTag(0);

            markerLloydsBank3 = googleMap.addMarker(new MarkerOptions()
                    .position(LloydsBank3)
                    .title("Lloyds Bank - Birmingham")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
            markerLloydsBank3.setTag(0);

            markerLloydsBank4 = googleMap.addMarker(new MarkerOptions()
                    .position(LloydsBank4)
                    .title("Lloyds Bank - Birmingham")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
            markerLloydsBank4.setTag(0);

            markerLloydsBank5 = googleMap.addMarker(new MarkerOptions()
                    .position(LloydsBank5)
                    .title("Lloyds Bank - Birmingham")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
            markerLloydsBank5.setTag(0);

            markerLloydsBank6 = googleMap.addMarker(new MarkerOptions()
                    .position(LloydsBank6)
                    .title("Lloyds Bank - Birmingham")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
            markerLloydsBank6.setTag(0);

            googleMap.moveCamera(CameraUpdateFactory.newLatLng(BarclaysBank1));
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gmap, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.staticmap);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}