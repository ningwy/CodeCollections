/*
* 用于获取状态栏的高度。
* @return 返回状态栏高度的像素值。
导入包java.lang.reflect.Field
*/
private int getStatusBarHeight() {
  int statusBarHeight = 0;
  if (statusBarHeight == 0) {
      try {
          Class c = Class.forName("com.android.internal.R$dimen");
          Object o = c.newInstance();
          Field field = c.getField("status_bar_height");
          int x = (Integer) field.get(o);
          statusBarHeight = getResources().getDimensionPixelSize(x);
      } catch (Exception e) {
          e.printStackTrace();
      }
  }
  return statusBarHeight;
}
