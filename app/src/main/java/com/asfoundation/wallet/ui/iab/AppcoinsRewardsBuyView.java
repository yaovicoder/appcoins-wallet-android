package com.asfoundation.wallet.ui.iab;

import io.reactivex.Observable;

interface AppcoinsRewardsBuyView {
  Observable<Object> getBuyClick();

  void showLoading();

  void setAmount(String amount);

  void showPaymentDetails();

  void hidePaymentDetails();
}