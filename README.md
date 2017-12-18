# CustomView1
自定义控件练习项目1<br>

每日一练<br>
这是一个详细自定义控件的项目<br>
主要有:1,自定义属性的使用<br>

    TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CustomTitleView, defStyleAttr, 0);
        int n = a.getIndexCount();
        for (int i = 0; i < n; i++) {
            int attr = a.getIndex(i);
            switch (attr) {
                case R.styleable.CustomTitleView_titleText:
                    mTitleText = a.getString(attr);
                    break;
                case R.styleable.CustomTitleView_titleTextColor:
                    mTitleTextColor = a.getColor(attr, Color.BLACK);
                    break;
                case R.styleable.CustomTitleView_titleTextSize:
                    mTitleTextSize = a.getDimensionPixelSize(attr,
                            (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 16, getResources().getDisplayMetrics()));
                    break;
            }
        }
        a.recycle();


2,在onMeasure中对MeasureSpec的specMode的处理,
    
      /**
     * MeasureSpec的specMode
     * 当我们在布局中设置了具体的宽高时，控件宽高为具体数值
     * 当我们设置为wrap_content时，我们会发现其会填充父布局，所以要做处理
     * specMode有三种数值:EXACTLY：一般是设置了明确的值或者是MATCH_PARENT
     * AT_MOST：表示子布局限制在一个最大值内，一般为WARP_CONTENT
     * UNSPECIFIED：表示子布局想要多大就多大，很少使用
     */
