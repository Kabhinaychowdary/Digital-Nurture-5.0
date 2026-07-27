import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  let showBook = true;
  let showBlog = true;
  let showCourse = true;

  return (
    <div className="container">
      <div className="column">
        <Course show={showCourse} />
      </div>

      <div className="vertical-line"></div>

      <div className="column">
        {showBook && <BookDetails />}
      </div>

      <div className="vertical-line"></div>

      <div className="column">
        {showBlog ? <BlogDetails /> : <h2>No Blogs</h2>}
      </div>
    </div>
  );
}

function Course(props) {
  if (props.show) {
    return <CourseDetails />;
  }
  return <h2>No Courses</h2>;
}

export default App;