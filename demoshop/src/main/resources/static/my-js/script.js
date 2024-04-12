// Lấy tất cả các slide
var slides = document.querySelectorAll('.carousel-item');
var currentSlide = 0;

// Hiển thị slide đầu tiên
slides[currentSlide].style.display = 'block';

function nextSlide() {
  // Ẩn slide hiện tại
  slides[currentSlide].style.display = 'none';

  // Tăng chỉ số của slide
  currentSlide = (currentSlide + 1) % slides.length;

  // Hiển thị slide tiếp theo
  slides[currentSlide].style.display = 'block';
}

// Thiết lập hàm tự động chuyển slide sau 4 giây
var slideInterval = setInterval(nextSlide, 4000);
