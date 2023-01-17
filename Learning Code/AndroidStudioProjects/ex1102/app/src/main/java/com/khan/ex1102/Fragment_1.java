package com.khan.ex1102;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Fragment_1 extends Fragment {

    WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        webView = view.findViewById(R.id.webView);

        // 1. Manifest.xml에서 인터넷 설정 해주기!

        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);

        String url = getActivity()
                .getSharedPreferences(MainActivity.SPF_TITLE, Context.MODE_PRIVATE)
                .getString("url", "https://www.naver.com");

        webView.loadUrl(url);

        return view;
    }
}