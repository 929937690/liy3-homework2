package com.cybr406.post;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.Locale;

@Entity
public class Post {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  
  String author;
  
  @Lob
  @Type(type = "org.hibernate.type.TextType")
  String content;

  @Enumerated(value = EnumType.STRING)
  Category category;

  String superstars;

  Date date;

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getSuperstars() {
    return superstars;
  }

  public void setSuperstars(String superstars) {
    this.superstars = superstars;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
  
}
