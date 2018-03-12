// Generated code from Butter Knife. Do not modify!
package com.flj.latte.ec.detail;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.diabin.latte.ec.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GoodsInfoDelegate_ViewBinding implements Unbinder {
  private GoodsInfoDelegate target;

  @UiThread
  public GoodsInfoDelegate_ViewBinding(GoodsInfoDelegate target, View source) {
    this.target = target;

    target.mGoodsInfoTitle = Utils.findRequiredViewAsType(source, R.id.tv_goods_info_title, "field 'mGoodsInfoTitle'", AppCompatTextView.class);
    target.mGoodsInfoDesc = Utils.findRequiredViewAsType(source, R.id.tv_goods_info_desc, "field 'mGoodsInfoDesc'", AppCompatTextView.class);
    target.mGoodsInfoPrice = Utils.findRequiredViewAsType(source, R.id.tv_goods_info_price, "field 'mGoodsInfoPrice'", AppCompatTextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GoodsInfoDelegate target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mGoodsInfoTitle = null;
    target.mGoodsInfoDesc = null;
    target.mGoodsInfoPrice = null;
  }
}
