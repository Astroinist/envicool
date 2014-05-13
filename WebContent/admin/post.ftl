<!DOCTYPE html>
<html >
    <head>
        <title><@spring.message "site.admin.post.title" /></title>
    </head>
    <body>
        <form action="post/publish.do" method="post">
            <input type="text" name="title"/>
            <textarea name="content"></textarea>
            <input type="submit" value="<@spring.message "button.submit" />" />
        </form>
    </body>
</html>