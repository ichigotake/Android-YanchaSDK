# yanchaSDK [![Build Status](https://travis-ci.org/ichigotake/Android-YanchaSDK.png)](https://travis-ci.org/ichigotake/Android-YanchaSDK)

## 概要

Androidアプリに[yancha](https://github.com/uzulla/yancha)クライアントを実装する手助けをする開発ツールキットです

## 開発状況

開発途上につき、まだ利用して頂ける状態ではありません

## 注意事項

ディレクリ構成や環境の模索等でgit-logのオブジェクトが **無駄に** 肥大化してしまっているので、

自分以外の方に使って頂けるようになりましたらレポジトリ(*git-log*)を一旦リセットさせていただきます

ダウンロード時間を減らすための処置でもあります

## ダウンロード

以下のようにGradleの設定を記述する

```
repositories {
        maven { url 'https://raw.github.com/ichigotake/Android-YanchaSDK/develop/repository' }
    }

    dependencies {
        compile 'net.ichigotake.yancha:YanchaSDK:0.0.1'
    }
}
```

## ライセンス

[Apache Lisence 2.0](http://www.apache.org/licenses/LICENSE-2.0)
