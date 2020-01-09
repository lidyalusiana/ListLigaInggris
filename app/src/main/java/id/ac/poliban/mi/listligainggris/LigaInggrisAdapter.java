package id.ac.poliban.mi.listligainggris;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class LigaInggrisAdapter extends BaseAdapter {
    //data berupa object List dari kelas POJO Makanan
    private List<LigaInggris> data = new ArrayList<>();

    public LigaInggrisAdapter(List<LigaInggris> data){
        //parameter konsturktor berupa data object List dari kelas Makanan
        this.data = data;
    }

    @Override
    public int getCount() {
        //kembalikan jumlah item dalam data
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        //mengembalikan object data pada posisi
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        //mengembalikan ID baris data jika ada
        //disini cuma mengembalikan nilai position
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_gambar;
        TextView tvNamaLogo;
        TextView tvLogoDesc;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_liga_inggris, parent, false);

        //deklarasikan View
        img_gambar = convertView.findViewById(R.id.img_gambar);
        tvNamaLogo = convertView.findViewById(R.id.tvNamaLogo);
        tvLogoDesc = convertView.findViewById(R.id.tvLogoDesc);

        //isi data
        Glide.with(parent.getContext())
                .load(data.get(position).getGambar())
                .apply(new RequestOptions().override(60, 60))
                .into(img_gambar);
        tvNamaLogo.setText(data.get(position).getNamaLogo());
        tvLogoDesc.setText(data.get(position).getLogoDesc());

        return convertView;
    }
}