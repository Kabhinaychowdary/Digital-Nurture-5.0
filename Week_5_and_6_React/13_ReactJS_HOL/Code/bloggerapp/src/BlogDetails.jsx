export const blogs = [
    {
        id: 1,
        title: "React Learning",
        author: "Stephen Biz",
        description: "Welcome to learning React!"
    },
    {
        id: 2,
        title: "Installation",
        author: "Schwzenedier",
        description: "You can install React from npm."
    }
];

function BlogDetails() {
    return (
        <div>
            <h2>Blog Details</h2>
            {blogs.map(blog => (
                <div key={blog.id}>
                    <p><b>{blog.title}</b></p>
                    <p>Author: {blog.author}</p>
                    <p>{blog.description}</p>
                </div>
            ))}
        </div>
    );
}

export default BlogDetails;