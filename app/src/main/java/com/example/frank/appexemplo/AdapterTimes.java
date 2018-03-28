package com.example.frank.appexemplo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Time;
import java.util.List;

/**
 * Created by Frank on 28/03/2018.
 */

public class AdapterTimes extends BaseAdapter {

    private Context contexto;
    private List<Times> times;

    public AdapterTimes(Context contexto, List<Times> times) {
        this.contexto = contexto;
        this.times = times;
    }

    @Override
    public int getCount() {
        return times.size();
    }

    @Override
    public Object getItem(int i) {
        return times.get(i);
    }

    @Override
    public long getItemId(int i) {
        return times.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = LayoutInflater.from(contexto).inflate(R.layout.linha_listsa_times, viewGroup, false);

        Times time = times.get(i);

        ImageView imagem = (ImageView) view1.findViewById(R.id.imageView);
        TextView nome = (TextView) view1.findViewById(R.id.textNome);
        TextView cidade = (TextView) view1.findViewById(R.id.textCidade);

        imagem.setImageResource(time.getImagem());
        nome.setText(time.getNome());
        cidade.setText(time.getCidade());

        return view1;
    }
}
