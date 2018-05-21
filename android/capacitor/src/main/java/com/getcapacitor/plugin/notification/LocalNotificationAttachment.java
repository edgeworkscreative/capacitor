package com.getcapacitor.plugin.notification;

import org.json.JSONObject;

class LocalNotificationAttachment {
  String id;
  String url;
  JSONObject options;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public JSONObject getOptions() {
    return options;
  }

  public void setOptions(JSONObject options) {
    this.options = options;
  }
}