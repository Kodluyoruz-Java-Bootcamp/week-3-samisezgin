package com.clonemedium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;


@SpringBootApplication
@EnableFeignClients
@ImportAutoConfiguration({ FeignAutoConfiguration.class })
public class Main
{
	public static void main(String[] args)
	{
		SpringApplication.run(Main.class, args);
		/*BlogService blogService = new BlogService();
		UserService userService = new UserService();
		TagService tagService = new TagService();

		User user1 = userService.createUser(new User("testUser1", "12345678", "sami@gmail.com"));
		User user2 = userService.createUser(new User("testUser2", "12345678", "test1@gmail.com"));
		User user3 = userService.createUser(new User("testUser3", "12345678", "test2@gmail.com"));
		User user4 = userService.createUser(new User("testUser4", "12345678", "test3@gmail.com"));		
		
		Blog blog1 = blogService.createBlog(new Blog("testBlog1", "Lorem ipsum dolor sit amet1", user1));
		Blog blog2 = blogService.createBlog(new Blog("testBlog2", "Lorem ipsum dolor sit amet2", user2));
		Blog blog3 = blogService.createBlog(new Blog("testBlog3", "Lorem ipsum dolor sit amet3", user3));
		Blog blog4 = blogService.createBlog(new Blog("testBlog4", "Lorem ipsum dolor sit amet4", user4));

		Tag tag1 = tagService.createTag(new Tag("testTag1", List.of(blog1)));
		Tag tag2 = tagService.createTag(new Tag("testTag2", List.of(blog2)));
		Tag tag3 = tagService.createTag(new Tag("testTag3", List.of(blog3)));
		Tag tag4 = tagService.createTag(new Tag("testTag4", List.of(blog4)));
		
			
		System.out.println("\nPrint all blog titles");
		blogService.printAllBlogs();
		System.out.println("\nPrint blog titles by user");
		userService.printBlogByUser(user1);
		userService.printBlogByUser(user2);
		userService.printBlogByUser(user3);
		userService.printBlogByUser(user4);
		
		System.out.println("Publish blogs");
		blogService.publishBlog(blog1);
		blogService.publishBlog(blog2);
		blogService.publishBlog(blog3);
		blogService.publishBlog(blog4);
		
		System.out.println("\nPrint blog titles by user");
		userService.printBlogByUser(user1);
		userService.printBlogByUser(user2);
		userService.printBlogByUser(user3);
		userService.printBlogByUser(user4);
		
		System.out.println("\nSet blog status : DELETED");
		blogService.deleteBlog(blog1);
		blogService.deleteBlog(blog2);
		blogService.deleteBlog(blog3);
		blogService.deleteBlog(blog4);
		
		System.out.println("\nPrint blog titles by user");
		userService.printBlogByUser(user1);
		userService.printBlogByUser(user2);
		userService.printBlogByUser(user3);
		userService.printBlogByUser(user4);
		
		
		System.out.println("\nSet blog status : DRAFT");
		blogService.draftBlog(blog1);
		blogService.draftBlog(blog2);
		blogService.draftBlog(blog3);
		blogService.draftBlog(blog4);
		
		System.out.println("\nPrint blog titles by user");
		userService.printBlogByUser(user1);
		userService.printBlogByUser(user2);
		userService.printBlogByUser(user3);
		userService.printBlogByUser(user4);
		
		
		
		
		System.out.println("\nUser follows tag");
		userService.followTag(user1, tag2);
		userService.followTag(user2, tag3);
		userService.followTag(user3, tag4);
		userService.followTag(user4, tag1);
		
		System.out.println("\nUser follows user");
		userService.followUser(user1, user2);
		userService.followUser(user2, user3);
		userService.followUser(user3, user4);
		userService.followUser(user4, user1);
		
		System.out.println("\nPrint followed users");
		userService.printFollowedUsers(user1);
		userService.printFollowedUsers(user2);
		userService.printFollowedUsers(user3);
		userService.printFollowedUsers(user4);
		
		System.out.println("\nPrint all tags");
		tagService.printAllTags();
		
		System.out.println("\nPrint blog title by tag");
		tagService.printBlogTitleByTag(tag1);
		tagService.printBlogTitleByTag(tag2);
		tagService.printBlogTitleByTag(tag3);
		tagService.printBlogTitleByTag(tag4);
		
		System.out.println("\nDelete blog");
		userService.deleteBlog(user4, blog4);		
		System.out.println("\nPrint all blog titles");		
		blogService.printAllBlogs();
		System.out.println("\nPrint blog titles by user");
		userService.printBlogByUser(user1);
		userService.printBlogByUser(user2);
		userService.printBlogByUser(user3);
		userService.printBlogByUser(user4);	
		
		System.out.println("User unfollows user");
		userService.unFollowUser(user1, user2);
		userService.unFollowUser(user2, user3);
		userService.unFollowUser(user3, user4);
		userService.unFollowUser(user4, user1);
		
		
		System.out.println("\nPrint followed users");
		userService.printFollowedUsers(user1);
		userService.printFollowedUsers(user2);
		userService.printFollowedUsers(user3);
		userService.printFollowedUsers(user4);
		
		System.out.println("\nRemove tags");
		tagService.removeTag(tag1);
		tagService.removeTag(tag2);
		tagService.removeTag(tag3);
		tagService.removeTag(tag4);
		
		System.out.println("\nPrint all tags");
		tagService.printAllTags();
		
		System.out.println("\nPrint blog title by tag");
		tagService.printBlogTitleByTag(tag1);
		tagService.printBlogTitleByTag(tag2);
		tagService.printBlogTitleByTag(tag3);
		tagService.printBlogTitleByTag(tag4);
		
		System.out.println("\nPrint all blog titles");
		blogService.printAllBlogs();		
		
		blogService.removeBlog(blog1);
		blogService.removeBlog(blog2);
		blogService.removeBlog(blog3);
		blogService.removeBlog(blog4);
		
		System.out.println("\nPrint all blog titles");
		System.out.println(blogService.getAll());
		System.out.println("\nPrint all user's blogs");
		blogService.printAllBlogs();
		
		System.out.println();
		*/
		
		
		
		
	}

}
