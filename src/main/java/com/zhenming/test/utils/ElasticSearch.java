package com.zhenming.test.utils;

import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ElasticSearch {

  TransportClient client = null;


  private static ElasticSearch instance = null;

  private ElasticSearch() {
    try {
      client = new PreBuiltTransportClient(Settings.EMPTY).addTransportAddress(
              new TransportAddress(InetAddress.getByName(Property.getProperty("es.host")),
                      Integer.valueOf(Property.getProperty("es.port"))));
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
  }

  private static synchronized void init() {
    if (instance == null) {
      instance = new ElasticSearch();
    }
  }

  public static ElasticSearch getInstance() {
    if (instance == null) {
      init();
      return instance;
    } else {
      return instance;
    }
  }

  public Object search(String str) {
    SearchResponse response = client.prepareSearch("font")
            .setTypes("information")
            .setSearchType(SearchType.QUERY_THEN_FETCH)
            .setQuery(QueryBuilders.matchPhraseQuery("fontName", str))
            .setPostFilter(QueryBuilders.rangeQuery("isDeleted").from("0").to("0"))
            .setFrom(0).setSize(60).setExplain(true)
            .get();
    return response;
  }

  public DeleteResponse delete() {
    return client.prepareDelete("testindex", "testtype", "yiqSJ2IBGHlAxirdf0cn").get();
  }

  public boolean insert(String index, String type, String id, String json) {
    IndexResponse response = client.prepareIndex(index, type, id).setSource(json, XContentType.JSON).get();

    System.out.println(response.getShardInfo().getSuccessful());

    return true;
  }

  public void aaa(){
    DeleteResponse deleteResponse = client.prepareDelete().get();
  }
}
